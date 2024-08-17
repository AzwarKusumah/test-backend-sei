package backend_sei.spring.core.controller;

import backend_sei.spring.core.entity.Lokasi;
import backend_sei.spring.core.service.LokasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LokasiController {

    @Autowired
    private LokasiService lokasiService;

    @PostMapping("/lokasi")
    public Lokasi createLokasi(@RequestBody Lokasi lokasi) {
        return lokasiService.saveLokasi(lokasi);
    }

    @GetMapping("/lokasi")
    public List<Lokasi> getAllLokasi() {
        return lokasiService.getAllLokasi();
    }

    @PutMapping("/lokasi/{id}")
    public ResponseEntity<Lokasi> updateLokasi(@PathVariable Long id, @RequestBody Lokasi lokasiDetails) {
        Lokasi updatedLokasi = lokasiService.updateLokasi(id, lokasiDetails);
        return ResponseEntity.ok(updatedLokasi);
    }

    @DeleteMapping("/lokasi/{id}")
    public ResponseEntity<Void> deleteLokasi(@PathVariable Long id) {
        lokasiService.deleteLokasi(id);
        return ResponseEntity.noContent().build();
    }
}

package backend_sei.spring.core.controller;

import backend_sei.spring.core.entity.Proyek;
import backend_sei.spring.core.service.ProyekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api")
public class ProyekController {

    @Autowired
    private ProyekService proyekService;

    @PostMapping("/proyek")
    public Proyek createProyek(@RequestBody Proyek proyek) {
        return proyekService.saveProyek(proyek);
    }

    @GetMapping("/proyek")
    public List<Proyek> getAllProyek() {
        return proyekService.getAllProyek();
    }

    @PutMapping("/proyek/{id}")
    public ResponseEntity<Proyek> updateProyek(@PathVariable Long id, @RequestBody Proyek proyekDetails) {
        Proyek updatedProyek = proyekService.updateProyek(id, proyekDetails);
        return ResponseEntity.ok(updatedProyek);
    }

    @DeleteMapping("/proyek/{id}")
    public ResponseEntity<Void> deleteProyek(@PathVariable Long id) {
        proyekService.deleteProyek(id);
        return ResponseEntity.noContent().build();
    }
}

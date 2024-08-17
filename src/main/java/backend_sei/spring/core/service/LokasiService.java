package backend_sei.spring.core.service;

import backend_sei.spring.core.entity.Lokasi;
import backend_sei.spring.core.repository.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LokasiService {

    @Autowired
    private LokasiRepository lokasiRepository;

    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    public Lokasi saveLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    public Lokasi updateLokasi(Long id, Lokasi lokasi) {
        Lokasi lokasiLama = lokasiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lokasi tidak ditemukan"));
        lokasiLama.setNamaLokasi(lokasi.getNamaLokasi());
        lokasiLama.setNegara(lokasi.getNegara());
        lokasiLama.setProvinsi(lokasi.getProvinsi());
        lokasiLama.setKota(lokasi.getKota());
        return lokasiRepository.save(lokasiLama);
    }

    public void deleteLokasi(Long id) {
        lokasiRepository.deleteById(id);
    }

}

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

    public Lokasi updateLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    public void deleteLokasi(Long id) {
        lokasiRepository.deleteById(id);
    }
}

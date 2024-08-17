package backend_sei.spring.core.service;

import backend_sei.spring.core.entity.Proyek;
import backend_sei.spring.core.repository.ProyekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyekService {

    @Autowired
    private ProyekRepository proyekRepository;

    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    public Proyek saveProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    public Proyek updateProyek(Long id, Proyek proyek) {
        Proyek proyekLama = proyekRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proyek tidak ditemukan"));
        proyekLama.setNamaProyek(proyek.getNamaProyek());
        proyekLama.setClient(proyek.getClient());
        proyekLama.setTglMulai(proyek.getTglMulai());
        proyekLama.setTglSelesai(proyek.getTglSelesai());
        proyekLama.setPimpinanProyek(proyek.getPimpinanProyek());
        proyekLama.setKeterangan(proyek.getKeterangan());
        proyekLama.setLokasiList(proyek.getLokasiList());
        return proyekRepository.save(proyekLama);
    }

    public void deleteProyek(Long id) {
        proyekRepository.deleteById(id);
    }
}

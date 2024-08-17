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

    public Proyek updateProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    public void deleteProyek(Long id) {
        proyekRepository.deleteById(id);
    }
}

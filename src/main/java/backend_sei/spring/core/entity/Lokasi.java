package backend_sei.spring.core.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;

@Entity
@Table(name = "lokasi")
public class Lokasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_lokasi", nullable = false, length = 256)
    private String namaLokasi;

    @Column(nullable = false, length = 256)
    private String negara;

    @Column(nullable = false, length = 256)
    private String provinsi;

    @Column(nullable = false, length = 256)
    private String kota;

    @CreationTimestamp
    private Timestamp createdAt;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}

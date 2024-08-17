package backend_sei.spring.core.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "proyek")
public class Proyek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_proyek", nullable = false, length = 256)
    private String namaProyek;

    @Column(nullable = false, length = 256)
    private String client;

    private LocalDateTime tglMulai;
    private LocalDateTime tglSelesai;

    @Column(name = "pimpinan_proyek", nullable = false, length = 256)
    private String pimpinanProyek;

    @Column(columnDefinition = "TEXT")
    private String keterangan;

    @CreationTimestamp
    private Timestamp createdAt;

    @ManyToMany
    @JoinTable(
            name = "proyek_lokasi",
            joinColumns = @JoinColumn(name = "proyek_id"),
            inverseJoinColumns = @JoinColumn(name = "lokasi_id")
    )
    private List<Lokasi> lokasiList;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(LocalDateTime tglMulai) {
        this.tglMulai = tglMulai;
    }

    public LocalDateTime getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(LocalDateTime tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public String getPimpinanProyek() {
        return pimpinanProyek;
    }

    public void setPimpinanProyek(String pimpinanProyek) {
        this.pimpinanProyek = pimpinanProyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public List<Lokasi> getLokasiList() {
        return lokasiList;
    }

    public void setLokasiList(List<Lokasi> lokasiList) {
        this.lokasiList = lokasiList;
    }
}

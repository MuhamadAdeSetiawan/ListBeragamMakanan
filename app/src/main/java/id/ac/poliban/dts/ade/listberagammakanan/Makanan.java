package id.ac.poliban.dts.ade.listberagammakanan;

public class Makanan {
    private String gambar;
    private String namaMakanan;
    private String detailMakanan;

    public Makanan(String gambar, String namaMakanan, String detailMakanan) {
        this.gambar = gambar;
        this.namaMakanan = namaMakanan;
        this.detailMakanan = detailMakanan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDetailMakanan() {
        return detailMakanan;
    }

    public void setDetailMakanan(String detailMakanan) {
        this.detailMakanan = detailMakanan;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getNamaMakanan(), getDetailMakanan());
    }
}

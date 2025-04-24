package modelos;

public class Consumidor {

    private int id, anoNascimento;
    private String escolaridade, estadoCivil;
    private int rendaDomiciliarAnual, gastosVinhos, gastosCarnes, comprasOnline, comprasPresenciais;

    public Consumidor(int id, int anoNascimento, String escolaridade, String estadoCivil,
            int rendaDomiciliarAnual, int gastosVinhos, int gastosCarnes, int comprasOnline, int comprasPresenciais) {
        this.id = id;
        this.anoNascimento = anoNascimento;
        this.escolaridade = escolaridade;
        this.estadoCivil = estadoCivil;
        this.rendaDomiciliarAnual = rendaDomiciliarAnual;
        this.gastosVinhos = gastosVinhos;
        this.gastosCarnes = gastosCarnes;
        this.comprasOnline = comprasOnline;
        this.comprasPresenciais = comprasPresenciais;
    }

    @Override
    public String toString() {
        return "Consumidor [id=" + id + ", anoNascimento=" + anoNascimento + ", escolaridade=" + escolaridade
                + ", estadoCivil=" + estadoCivil + ", rendaDomiciliarAnual=" + rendaDomiciliarAnual + ", gastosVinhos="
                + gastosVinhos + ", gastosCarnes=" + gastosCarnes + ", comprasOnline=" + comprasOnline
                + ", comprasPresenciais=" + comprasPresenciais + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getRendaDomiciliarAnual() {
        return rendaDomiciliarAnual;
    }

    public void setRendaDomiciliarAnual(int rendaDomiciliarAnual) {
        this.rendaDomiciliarAnual = rendaDomiciliarAnual;
    }

    public int getGastosVinhos() {
        return gastosVinhos;
    }

    public void setGastosVinhos(int gastosVinhos) {
        this.gastosVinhos = gastosVinhos;
    }

    public int getGastosCarnes() {
        return gastosCarnes;
    }

    public void setGastosCarnes(int gastosCarnes) {
        this.gastosCarnes = gastosCarnes;
    }

    public int getComprasOnline() {
        return comprasOnline;
    }

    public void setComprasOnline(int comprasOnline) {
        this.comprasOnline = comprasOnline;
    }

    public int getComprasPresenciais() {
        return comprasPresenciais;
    }

    public void setComprasPresenciais(int comprasPresenciais) {
        this.comprasPresenciais = comprasPresenciais;
    }
}
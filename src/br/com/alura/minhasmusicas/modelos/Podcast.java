package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String Apresentador;
    private String Descricao;

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String apresentador) {
        Apresentador = apresentador;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public int getClassificao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}

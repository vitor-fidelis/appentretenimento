package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificao() >= 9){
            System.out.println(audio.getTitulo() + " é um sucesso absoluto!!!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção para seu dia a dia.");
        }
    }
}

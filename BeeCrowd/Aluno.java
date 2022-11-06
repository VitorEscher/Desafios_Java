package BeeCrowd;

import java.util.ArrayList;

public class Aluno {
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double frequencia;



    public Aluno(String matricula, double nota1, double nota2, double nota3, double frequencia) {
        super();
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.frequencia = frequencia;
    }



    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public double getNota1() {
        return nota1;
    }



    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }



    public double getNota2() {
        return nota2;
    }



    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }



    public double getNota3() {
        return nota3;
    }



    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }



    public double getFrequencia() {
        return frequencia;
    }



    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }



    public double MediaAluno(Aluno aluno) {
        double media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() / 3);
        return media;
    }

    public String Situacao(double media) {
        if(media >= 5 ) {
            String status = "Aprovado";
            return status;
        } else {
            String status = "Reprovado";
            return status;
        }
    }

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();

        Aluno aluno1 = new Aluno("00001", 10, 10, 10, 0.8);
        Aluno aluno2 = new Aluno("00010", 5, 5, 10, 0.7);
        Aluno aluno3 = new Aluno("00100", 8, 9, 4, 0.6);
        Aluno aluno4 = new Aluno("01000", 6, 6, 7, 0.2);
        Aluno aluno5 = new Aluno("10000", 1, 1, 2, 1.0);

        System.out.println(aluno1.Situacao(aluno1.MediaAluno(aluno1)));
        System.out.println(aluno2.Situacao(aluno2.MediaAluno(aluno2)));
        System.out.println(aluno3.Situacao(aluno3.MediaAluno(aluno3)));
        System.out.println(aluno4.Situacao(aluno4.MediaAluno(aluno4)));
        System.out.println(aluno5.Situacao(aluno5.MediaAluno(aluno5)));

        list.add(aluno1);
        list.add(aluno2);
        list.add(aluno3);
        list.add(aluno4);
        list.add(aluno5);

    }

}

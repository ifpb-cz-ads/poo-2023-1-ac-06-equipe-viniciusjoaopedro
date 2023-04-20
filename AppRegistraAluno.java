class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;
    
    private static int contadorEstudante;
    
    RegistraAluno() {
        contadorEstudante++;
    }
    
    // retorna o nome do estudante
    public String getNome() {
        return nome;
    }
    
    public void setNome(String temp) {
        nome = temp;
    }
    
    // retorna o endereço do estudante
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String temp) {
        endereco = temp;
    }
    
    // retorna a idade do estudante
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int temp) {
        idade = temp;
    }
    
    public void setNotaMatematica(double temp) {
        notaMatematica = temp;
    }
    
    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }
    
    public void setNotaGeografia(double temp) {
        notaGeografia = temp;
    }
    
    // retorna a média do estudante
    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
        return resultado;
    }
    
    // retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos () {
        return contadorEstudante;
    }
}

public class AppRegistraAluno {
    public static void main(String args[]) {
        // cria 3 objetos RegistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        
        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");
        
        System.out.println(ana.getNome());
        System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());
    }
}

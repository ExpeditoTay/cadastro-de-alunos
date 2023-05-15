public class Alunos {

    private String nome, cidade, Estado, nomeDaMae, sexo, endereco;
    private int telefone, CPF, RG, dataDeNascimento, grauDeEscolaridade;
    public static void main(String[] args) {

        Alunos aluno1 = new Alunos();
        aluno1.nome = "Expedito";
        aluno1.sexo = "Masculino";
        aluno1.endereco = "R.Agusuto Dos Anjos, 399";
        aluno1.cidade = "Sobral";
        aluno1.Estado = "Ceará";
        aluno1.nomeDaMae = "Ivonilda";
        aluno1.grauDeEscolaridade = 2;
        aluno1.telefone = 93312987;
        aluno1.RG = 2009874675; 
        aluno1.grauDeEscolaridade = 2;
        aluno1.CPF = 1234432;
        
                System.out.println("Nome do Aluno: "+ aluno1.nome);
                System.out.println("Sexo: "+ aluno1.sexo);
                System.out.println("RG: "+ aluno1.RG);
                System.out.println("Endereço: "+ aluno1.endereco);
                System.out.println("Cidade: "+ aluno1.cidade);
                System.out.println("Estado: "+ aluno1.Estado);
                System.out.println("Nome da mãe: "+ aluno1.nomeDaMae);
                System.out.println("Gru de escolaridade: "+ aluno1.grauDeEscolaridade);
                System.out.println("Telefone: "+ aluno1.telefone);
                System.out.println("CPF:"+ aluno1.CPF);
               
                 
    }
}


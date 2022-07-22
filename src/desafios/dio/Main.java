package desafios.dio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício - Calculadora");
        Calculadora.somar(3, 6);
        Calculadora.subtrair(9,1.8);
        Calculadora.multiplicar(7,8);
        Calculadora.dividir(5,2.5);

        //Mensagem
        System.out.println("Exercício - Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício - Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}

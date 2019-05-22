
/**
 * Implementação base de Lista Sequencial de forma estruturada.
 *
 */
import javax.swing.JOptionPane;

public class Principal {

    /**
     * Tamanho máximo da lista.
     */
    private static final int TAMANHO_LISTA = 100;
    /**
     * Tamanho atual da fila.
     */
    private static int n = 0;

    /**
     * Realiza a leitura dos dados dos nós.
     *
     * @return O valor lido.
     */
    public static int leitura() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
    }

    /**
     * Insere um Nó no final da lista.
     *
     * @param lista Lista dos Nós.
     * @param dado Um novo valor de um nó a ser inserido na lista.
     * @return Verdadeiro ou falso se conseguiu incluir o novo valor.
     */
    public static boolean inserirFim(int[] lista, int dado) {
        if (n < TAMANHO_LISTA) {
            //Insere o novo valor na posição n.
            lista[n] = dado;
            //Incrementa a quantidade de Nós.
            n = n + 1;
            return true;
        } else {
            System.out.println("Inserir Fim - Lista cheia.");
            return false;
        }
    }

    /**
     * Lista os dados da lista.
     *
     * @param lista Lista para exibir os dados.
     * @param n Quantidade de Nós da lista.
     * @return Uma String com os dados da lista.
     */
    public static String listar(int[] lista, int n) {
        //String de retorno
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp = temp + (i) + "-" + lista[i] + "\n";
        }
        return temp;
    }

    /**
     * Retorna se a lista está cheia.
     *
     * @return Verdadeiro ou falso se a lista está cheia.
     */
    public static boolean estaCheia() {
        return n == TAMANHO_LISTA;
    }

    /**
     * Retorna se a lista esta vazia.
     *
     * @return Verdadeiro ou falso se a lista está vazia.
     */
    public static boolean estaVazia() {
        return n == 0;
    }

    /**
     * Retorna a quantidade de Nós da lista.
     *
     * @return A quantidade de Nós da lista.
     */
    public static int getQuantidade() {
        return n;
    }

   /**
     * Método principal.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Declaração da lista
         */
        int lista[] = new int[TAMANHO_LISTA];

        // Controla o menu da lista
        int opcao = -1;

        //Laço do menu de opções
        while (opcao != 99) {
            //Monta o menu de opções
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Lista Sequencial ###\n"
                    + "Selecione a opção desejada:\n"
                    + " 1- Listar Nós\n"
                    + " 2- Inserir Nó no início\n"
                    + " 3- Inserir Nó em uma posição especifica\n"
                    + " 4- Inserir Nó no fim\n"                    
                    + " 5- Inserir Nó ordenado\n"
                    + " 6- Remover Nó do início\n"
                    + " 7- Remover Nó de uma posição específica\n"
                    + " 8- Remover Nó do fim\n"                    
                    + " 9- Remover Nó pelo valor\n"
                    + "10- Procurar o dado de uma posição específica\n"
                    + "11- Procurar a posição de um dado\n"
                    + "12- Mostrar a quantidade de Nós\n"
                    + "13- Está cheia?\n"
                    + "14- Está vazia?\n"
                    + "99- Sair\n"));
            switch (opcao) {
                case 1: {
                    if (estaVazia()) {
                        JOptionPane.showMessageDialog(null, "Lista vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Listagem \n" + listar(lista, n));
                    }
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    //Preenche o valor do dado
                    int dado = leitura();
                    if (inserirFim(lista, dado) == true) {
                        JOptionPane.showMessageDialog(null, "Nó inserido no fim com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nó não inserido no fim!");
                    }
                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    break;
                }
                case 6: {

                    break;
                }
                case 7: {

                    break;
                }
                case 8: {

                    break;
                }
                case 9: {

                    break;
                }
                case 10: {

                    break;
                }
                case 11: {

                    break;
                }
                case 12: {
                    JOptionPane.showMessageDialog(null, "Quantidade de Nós na lista : " + getQuantidade());
                    break;
                }
                case 13: {
                    JOptionPane.showMessageDialog(null, "Lista está cheia : " + estaCheia());
                    break;
                }
                case 14: {
                    JOptionPane.showMessageDialog(null, "Lista está vazia : " + estaVazia());
                    break;
                }
                //Opção de saída do programa
                case 99: {
                    System.out.println("Saindo do programa!");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }//Fim switch
        }//Fim while
    }//Fim main
}//Fim Principal


/**
 * Classe para retratar um ponto do plano cartesiano 
 * @author Michelle
 */
public class Ponto {
    
    private int x;
    private int y;
    private static int qtdePontos;

    /**
     * Retorna o valor da coordenada no eixo X
     * @return Valor da coordenada no eixo X
     */
    public int getX() {
        return x;
    }
    /**
     * Define o valor da coordenada no eixo X
     * @param x Valor da coordenada no eiox X
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Retorna o valor da coordenada no eixo Y
     * @return Valor da coordenada no eixo Y
     */
    public int getY() {
        return y;
    }

    /**
     * Define o valor da coordenada no eixo Y
     * @param y Valor da coordenada no eixo Y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Construtor cria um ponto com as coordenadas X=0 e Y=0
     */
    public Ponto(){
        setX(0);
        setY(0);
        qtdePontos += 1;
    }
    
    /**
     * Construtor cria um ponto com as coordenadas definidas como parâmetro
     * @param x Coordenada do eixo x
     * @param y Coordenada do eixo y
     */
    public Ponto(int x, int y){
        setX(x);
        setY(y);
        qtdePontos += 1;
    }
    
    /**
     * Retorna um valor de enumeração Quadrante para indicar em que 
     * quadrante do plano cartesiano o ponto se encontra
     * @return Valor de enumeração Quadrante
     */
    public Quadrante identificarQuadrante(){
        if(x > 0 && y > 0){
            return Quadrante.PRIMEIRO;
        }
        if(x < 0 && y > 0){
            return Quadrante.SEGUNDO;
        }
        if(x < 0 && y < 0){
            return Quadrante.TERCEIRO;
        }
        if(x > 0 && y < 0){
            return Quadrante.QUARTO;
        }
        return Quadrante.NENHUM;
    }
    /**
     * Retorna true se ponto estiver incidindo dobre eixo X
     * @return 
     */
    public boolean estaIncidindoSobreX(){
        if(x == 0){
            return true;
        }
        return false;
    }
    
    /**
     * Retorna true se ponto estiver incidindo dobre eixo Y
     * @return 
     */
    public boolean estaIncidindoSobreY(){
        if(y == 0){
            return true;
        }
        return false;
    }
    /**
     * Calcula a distância entre dois pontos
     * @param ponto Ponto do objeto recebido como parâmetro
     * @return Distância entre dois pontos
     */
    public double calcularDistancia(Ponto ponto){
        return Math.sqrt(Math.pow(( ponto.getX() - x), 2) + Math.pow((ponto.getY() - y), 2));
    }
    
    /**
     * Quantidade de objetos da classe Ponto
     * @return Quantidade de pontos
     */
    public static int getQtdePontos() {
       return qtdePontos;
    }
    
    
    
}

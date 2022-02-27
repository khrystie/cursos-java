public class RegistrarPontos {

    private CalculadoraBonus bonus;

    public RegistrarPontos(CalculadoraBonus cb){
        bonus = cb;
    }

    public void fazerUmComentario(Usuario u){
        u.pontos += 3*bonus.bonus(u);
    }
    public void criarUmTopico(Usuario u){
        u.pontos += 5*bonus.bonus(u);
    }
    public void darUmLike(Usuario u){
        u.pontos += 1*bonus.bonus(u);
    }
}

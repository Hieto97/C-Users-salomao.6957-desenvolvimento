public class Carro2 {
    private Integer DiametroDoPneu;
    private String motor;
    private String porta;
    private String busina;
    private String farol;
    private Boolean chave;
    private Boolean acelerador;

    public Integer getDiametroDoPneu() {
        return DiametroDoPneu;

    }

    public void setDiametroDoPneu(Integer diametroDoPneu) {
        DiametroDoPneu = diametroDoPneu;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBusina() {
        return busina;
    }

    public void setBusina(String busina) {
        this.busina = busina;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public Boolean getChave() {
        return chave;
    }

    public Boolean getAcelerador() {
        return acelerador;
    }

    public void setAcelerador(Boolean acelerador) {
        this.acelerador = acelerador;
    }

    public void setChave(Boolean chave) {
        this.chave = chave;
    }
    public static Boolean ligarCarro(Boolean chaveDoCarro) {

        if(chaveDoCarro !=null && chaveDoCarro) {
            System.out.println( " ligando Carro ");
            acelerarCarro(chaveDoCarro, true);
        }
        return chaveDoCarro;
    }
    public static Boolean acelerarCarro (Boolean chaveDoCarro, Boolean acelerador){

        if(chaveDoCarro !=null && chaveDoCarro) {
            System.out.println( "acelerar Carro ");
        }else{
            System.out.println( "Impossivel de acelerar o carro ");
        }
        return acelerador;
    }

    public static void main(String[] args) {
        ligarCarro(false);
    }

    }





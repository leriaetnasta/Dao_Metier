public class MetierImp1 implements IMetier{
    private IDao dao; //

    @Override

    public double calcul() {
        double temperature= dao.getData();
        double res=temperature*Math.cos(temperature*3.14)*5400;
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }
}

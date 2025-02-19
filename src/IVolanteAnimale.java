public class IVolanteAnimale implements IAnimale{

    public IVolanteAnimale() {
        
    }

    public void faiVolare(IVolanteAnimale animale){
        animale.vola();
    }

    public void vola(){
        System.out.println("Sto volando!!!");
    }

    public void nuota(){

    }
    
}

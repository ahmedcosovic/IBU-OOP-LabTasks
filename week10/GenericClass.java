public class GenericClass<tip> {
    private tip value;

    public GenericClass(tip value){
        this.value=value;
    }

    public tip getValue(){
        return this.value;
    }

    public String toString(){
        return value.getClass().getSimpleName()+" Value :"+this.value;
    }
}

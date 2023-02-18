/*
    @author DanujaV
    @created 2/7/23 - 9:37 AM   
*/

public class CommonClass<T> {   //type parameter
    T data;

    CommonClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

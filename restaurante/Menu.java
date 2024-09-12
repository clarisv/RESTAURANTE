public class Menu {
    private String categoria;
    private String item;
    private Double preco;

    public Menu(String categoria, String item, Double preco){
        this.categoria = categoria;
        this.item = item;
        this.preco = preco;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public String getItem(){
        return item;
    }
    
    public Double getPreco(){
        return preco;
    }
   
    public void visualizarMenu(){
        System.out.println("Categoria: " + categoria);
        System.out.println("Item: " + item);
        System.out.println("Preco: " + preco);
    }
}

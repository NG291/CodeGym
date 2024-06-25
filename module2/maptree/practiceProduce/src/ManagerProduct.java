import java.util.*;

public class ManagerProduct<T> {
    private ArrayList<Product> listProcduct;
    public ManagerProduct(){
        this.listProcduct=new ArrayList<Product>();
    }
    public ManagerProduct(ArrayList<Product>listProcduct){
        this.listProcduct=listProcduct;
    }
    // Thêm sản pham
    public void addProduct(Product product) {
        this.listProcduct.add(product);
    }
    // Sửa thông tin  sản phẩm theo id
    public void FixProduct(Product product1, String id) {
       boolean found= false;
        for (Product product : listProcduct) {
            if (product.getId().equals(id)) {
                product.setName(product1.getName());
                product.setPrice(product1.getPrice());
                found= true;
                break;
            }
        }
        if(!found){
            System.out.println("Khôngtimfm thấy sản phẩm theo ID: "+ id);
        }
    }
    // Xóa thông tin theo id
    public void removeIdProduct(String id){
     boolean found= false;
        for(Product product:listProcduct){
            if(product.getId().equals(id)){
                listProcduct.remove(product);
                found= true;
                break;
            }
        }
        if(!found){
            System.out.println(" Không có sinh viên nào cần xóa theo id này đã cho");
        }
    }
    // Tìm kiếm sản phẩm theo tên
    public void findProduct(String name){
        boolean found = false;
        for (Product product: listProcduct){
            if(product.getName().equals(name)){
                System.out.println(product.toString());
                found= true;
                break;
            }
        }
        if(!found){
            System.out.println("Không có tên sản phẩm bạn cần tìm");
        }
    }
    // in danh sach san pham
    public void Display(){
        for ( Product product: listProcduct){
            System.out.println(product);
        }
    }
    // sắp xếp mảng tăng dần theo giá
     public void sortAscendingProduct(){
         Collections.sort(listProcduct, Comparator.comparing(Product::getPrice));
     }
     // sắp xếp mảng giảm dần theo giá
    public void sortProductsByPriceDescending(){
        Collections.sort(listProcduct, Comparator.comparing(Product::getPrice).reversed());

    }

}

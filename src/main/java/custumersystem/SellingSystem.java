package custumersystem;

import java.util.Scanner;

public class SellingSystem {

    static Scanner sc = new Scanner(System.in);

    // Atributes products
    static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;

    // Atributes customers
    static int document;
    static String name;
    static String lastname;
    static String address;
    static int phone;
    static String email;


    // Atributes sale
    static int saleId;
    static String date;
    static String type;
    static int quantitySold;
    static double total;
    static int productId;
    static int customerDocument;

    public static void main(String[] args) {

        createProducts();
        getProducts();
        System.out.println("Ingrese el id del producto a actualizar");
        int id = sc.nextInt();
        updateProducts(id);

        System.out.println("Ingrese el id del producto a eliminar");
        id = sc.nextInt();
        sc.nextLine();
        deleteProducts(id);

        createCustomers();
        getCustomers();
        System.out.println("Ingrese el documento del usuario a actualizar");
        int document = sc.nextInt();
        updateCustomers(document);

        System.out.println("Ingrese el documento del usuario a eliminar");
        document = sc.nextInt();
        sc.nextLine();
        DeleteCustomer(document);

        createSale();
        getSale();
    }

    // Class Methods

    public static void createProducts() {
        System.out.println("Ingrese el id del producto");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del producto");
        description = sc.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = sc.nextBoolean();
    }

    public static void getProducts() {
        System.out.println("Id: " + id + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "State: " + state + "\n");
    }

    public static void updateProducts(int findId) {

        if (findId == id) {

            System.out.println("Ingrese el id del producto");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del producto");
            description = sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto");
            state = sc.nextBoolean();
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public static void deleteProducts(int deleteId) {

        if (deleteId == id) {
            id = 0;
            description = "";
            price = 0.0;
            quantity = 0;
            state = false;

        } else {
            System.out.println("Id " + id + " no encontrado");
        }
    }

    public static void createCustomers() {
        System.out.println("Ingrese el documento del usuario");
        document = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del usuario");
        name = sc.nextLine();
        System.out.println("Ingrese el apellido del usuario");
        lastname = sc.nextLine();
        System.out.println("Ingrese la dirrecion");
        address = sc.nextLine();
        System.out.println("Ingrese el telefono del usuario");
        phone = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el correo del usuario");
        email = sc.nextLine();
    }

    public static void getCustomers() {
        System.out.println("Document: " + document + "\n" +
                "Name: " + name + "\n" +
                "Lastname: " + lastname + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n");
    }

    public static void updateCustomers(int findDocument) {
        if (findDocument == document) {
            System.out.println("Ingrese el documento del usuario");
            document = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del usuario");
            name = sc.nextLine();
            System.out.println("Ingrese el apellido del usuario");
            lastname = sc.nextLine();
            System.out.println("Ingrese la dirrecion");
            address = sc.nextLine();
            System.out.println("Ingrese el telefono del usuario");
            phone = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el correo del usuario");
            email = sc.nextLine();
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public static void DeleteCustomer(int deleteDocuments) {
        if (deleteDocuments == document) {

            document = 0;
            name = "";
            lastname = "";
            address = "";
            phone = 0;
            email = "";
        }
    }public static void createSale() {

        System.out.println("Ingrese el id de la venta");
        saleId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la fecha de la venta (dd/mm/aaaa)");
        date = sc.nextLine();

        System.out.println("Ingrese el tipo de venta (Contado / Credito)");
        type = sc.nextLine();

        System.out.println("Ingrese el id del producto");
        productId = sc.nextInt();

        System.out.println("Ingrese el documento del cliente");
        customerDocument = sc.nextInt();

        System.out.println("Ingrese la cantidad a vender");
        quantitySold = sc.nextInt();

        if (productId == id && customerDocument == document) {

            if (quantitySold <= quantity) {

                total = quantitySold * price;
                quantity -= quantitySold;

                System.out.println("Venta realizada correctamente");
                System.out.println("Total a pagar: " + total);

            } else {
                System.out.println("No hay suficiente stock");
            }

        } else {
            System.out.println("Producto o cliente no encontrado");
        }
    }

    public static void getSale() {
        System.out.println("Sale Id: " + saleId + "\n" +
                "Date: " + date + "\n" +
                "Type: " + type + "\n" +
                "Product Id: " + productId + "\n" +
                "Product Name: " + description + "\n" +
                "Customer Document: " + customerDocument + "\n" +
                "Customer Name: " + name + " " + lastname + "\n" +
                "Quantity Sold: " + quantitySold + "\n" +
                "Total: " + total + "\n");
        }

}
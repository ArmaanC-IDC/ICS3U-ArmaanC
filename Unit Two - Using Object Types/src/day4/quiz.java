// package day4;

// public class quiz {
//     public static void main(String[] args) {
//         //1. create 2 products
//         Product laptop = new Product("laptop", 999.99, 5);
//         Product headphones = new Product("headphones", 199.99, 10);

//         //2. make a customer
//         Customer alice = new Customer("Alice", 1200.00);

//         //3. add the laptop to alice's cart
//         alice.addToCart(laptop);

//         //4. add the headphones to alice's cart
//         alice.addToCart(headphones);

//         //5. show what's in alice's cart
//         String cartContents = alice.getCart();
//         System.out.println(cartContents);

//         //6. calculate the total cost
//         double totalCost = laptop.getPrice() + headphones.getPrice();

//         //7. print the total cost
//         System.out.println(totalCost);

//         //8. you told us to skip it

//         //9. create an order for the laptop
//         Order orderForLaptop = new Order(alice, laptop);

//         //10. confirm the order
//         String orderConfirmation = orderForLaptop.confirmOrder();
//         System.out.println(orderConfirmation);
//     }
// }

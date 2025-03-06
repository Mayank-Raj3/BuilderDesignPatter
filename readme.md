# Builder Design Pattern

## Introduction
The Builder Design Pattern is a creational design pattern used to construct complex objects step by step. It provides a clear and readable way to create objects by using a separate builder class, allowing optional parameters and improving code maintainability.

## Explanation of the Given Code
The provided Java code demonstrates the **Builder Design Pattern** in constructing a `Product` object.

### **1. Product Class**
The `Product` class represents a product with attributes like `name`, `price`, `description`, `review`, `images`, `category`, and `company`.

#### **Key Features:**
- The constructor of `Product` is private and accepts a `Builder` instance to initialize fields.
- The constructor includes a validation check to ensure `price` is greater than 0.
- A static method `getBuilder()` is provided to return a new `Builder` instance.
- The `toString()` method is overridden to print product details.

```java
public class Product {
    private String name;
    private int price;
    private String description;
    private int review;
    private String images;
    private String category;
    private String company;

    private Product(Builder b) {
        if (b.getPrice() == 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.name = b.getName();
        this.price = b.getPrice();
        this.description = b.getDescription();
        this.review = b.getReview();
        this.images = b.getImages();
        this.category = b.getCategory();
        this.company = b.getCompany();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", description=" + description + ", review=" + review;
    }
}
```

### **2. Builder Class**
- The `Builder` class is a static inner class inside `Product`.
- It contains the same fields as `Product` but provides setter methods that return `this`, allowing method chaining.
- The `build()` method creates and returns a `Product` object.

```java
public static class Builder {
    private String name;
    private int price;
    private String description;
    private int review;
    private String images;
    private String category;
    private String company;

    public Product build() {
        return new Product(this);
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setPrice(int price) {
        this.price = price;
        return this;
    }
    public Builder setDescription(String description) {
        this.description = description;
        return this;
    }
    public Builder setReview(int review) {
        this.review = review;
        return this;
    }
    public Builder setImages(String images) {
        this.images = images;
        return this;
    }
    public Builder setCategory(String category) {
        this.category = category;
        return this;
    }
    public Builder setCompany(String company) {
        this.company = company;
        return this;
    }
}
```

### **3. Main Class (Client Code)**
- In the `Main` class, we use `Product.getBuilder()` to get an instance of `Builder`.
- The builder methods are chained to set values.
- Finally, `build()` is called to create the `Product` object.

```java
public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("iPhone 15")
                .setCompany("Apple")
                .setDescription("This is an iPhone")
                .setPrice(1500)
                .build();
        
        System.out.println(p);
    }
}
```

## **Advantages of the Builder Pattern**
1. **Improves Readability**: Eliminates confusion from long constructor arguments.
2. **Enforces Validation**: Ensures object consistency before creation.
3. **Immutable Objects**: Reduces bugs by avoiding setters in the main class.
4. **Flexible Object Construction**: Allows optional parameters to be set selectively.

## **When to Use the Builder Pattern?**
- When an object has multiple optional parameters.
- When constructors with multiple parameters make code difficult to read.
- When immutability is required after object creation.

## **Conclusion**
The Builder Design Pattern is an effective way to create complex objects with multiple fields while keeping the code clean and maintainable. It provides flexibility by allowing selective setting of parameters, making it a widely used pattern in Java applications.


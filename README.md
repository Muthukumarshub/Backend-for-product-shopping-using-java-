# Mall Inventory Management System

## Overview
The **Mall Inventory Management System** is a Java-based application that helps manage product categories, brands, prices, and quantities for a mall. The project uses a `HashMap` to store and retrieve product details efficiently and provides methods to update and display the inventory.

## Features
- Add new products to the inventory under specific categories.
- Update the inventory with additional products.
- Display the complete inventory with details like category, brand, price, and quantity.

## Project Structure
The project consists of the following classes:

1. **`Main`**: 
   - The entry point of the program. It contains the `main` method for initializing the system.

2. **`Driver`**:
   - Acts as a test driver for the system, showcasing how to use the `User` class to update and print the inventory.

3. **`User`**:
   - Handles the business logic for managing the inventory, including updating and displaying product details.

4. **`Product`**:
   - Represents individual products with attributes such as `category`, `brand`, `price`, and `quantity`.

## Class Details
### `Main`
- Initializes a shared `HashMap` to manage the inventory.

### `Driver`
- Demonstrates the usage of the `User` class by:
  - Adding products to the inventory.
  - Printing the inventory details.

### `User`
- **Methods**:
  - `updatemall(String key, String category, String brand, int price, int quantity)`: Adds or updates products in the inventory.
  - `print()`: Displays the current inventory in a formatted manner.

### `Product`
- **Attributes**:
  - `category`: The category of the product.
  - `brand`: The brand name of the product.
  - `price`: The price of the product.
  - `quantity`: The quantity of the product.

## Example Usage
```java
HashMap<String, ArrayList<Product>> map = new HashMap<>();
User user = new User(map);

user.updatemall("Shirt", "Shirt", "Allensolly", 1500, 1);
user.updatemall("Shirt", "Shirt", "Ramraj", 1800, 1);
user.updatemall("Pant", "Pant", "Allensolly", 2000, 2);
user.updatemall("Pant", "Pant", "Ramraj", 2000, 2);
user.updatemall("Inners", "Inners", "Jockey", 100, 5);

user.print();

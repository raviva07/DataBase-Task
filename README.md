# MongoDB Day 1 Task

## 1. Find all the information about each product

{}


## 2. Find the product price between 400 and 800

{ product_price: { $gte: 400, $lte: 800 } }


## 3. Find the product price NOT between 400 and 600

{
  $or: [
    { product_price: { $lt: 400 } },
    { product_price: { $gt: 600 } }
  ]
}



## 4. List four products greater than 500 in price

{ product_price: { $gt: 500 } }

Limit: 4

## 5. Find product name and product material of each product
Filter:

{}

Project:

{ product_name: 1, product_material: 1, _id: 0 }


## 6. Find the product with row id 10

{ id: "10" }


## 7. Find only the product name and product material
Filter:

{}

Project:
{ product_name: 1, product_material: 1, _id: 0 }


## 8. Find products where material contains "soft"
{ product_material: { $regex: "soft", $options: "i" } }


## 9. Find product with color indigo and price 492
{ product_color: "indigo", product_price: 492 }


## 10. Delete products where price is 28
{ product_price: 28 }


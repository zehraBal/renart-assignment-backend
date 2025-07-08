# Product Listing Backend API

This is a Spring Boot application that serves as the backend for a product listing platform.  
It reads product data from a static JSON file and calculates each product's price dynamically based on the real-time gold price.

---

## 📦 Features

- 📄 Serves product data from a JSON file (`product.json`)
- 💰 Dynamically calculates price using real-time gold price from [GoldAPI](https://www.goldapi.io/)
- 🔁 Price formula:  
  `price = (popularityScore + 1) * weight * goldPrice`
- 🎨 Each product contains 3 images (one for each color option)

---

## 🧮 Sample Product JSON Structure

```json
{
  "name": "Golden Bracelet",
  "popularityScore": 0.75,
  "weight": 120.0,
  "images": {
    "red": "url-to-red-image",
    "blue": "url-to-blue-image",
    "green": "url-to-green-image"
  }
}
```

---

## 🚀 Endpoint

### GET `/api/products`

Returns all products with their dynamically calculated prices.

#### ✅ Example Response:

```json
[
  {
    "name": "Golden Bracelet",
    "popularityScore": 0.75,
    "weight": 120.0,
    "images": {
      "red": "url1",
      "blue": "url2",
      "green": "url3"
    },
    "price": 2998.56
  }
]
```

---

## ⚙️ Configuration

You must set the following properties in `application.properties`:

```properties
gold.api.url=https://www.goldapi.io/api/XAU/USD
gold.api.key=api_key
```

You can get an API key from 👉 [https://www.goldapi.io/](https://www.goldapi.io/)

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- RestTemplate
- ObjectMapper (Jackson)
- Lombok

---

## ✍️ Author

👤 Fatma Zehra Bal
🛠 Junior Full Stack Developer

---

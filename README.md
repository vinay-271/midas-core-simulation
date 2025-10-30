# 🏦 Midas Core Simulation — J.P. Morgan Chase & Co.

A backend engineering simulation project replicating core banking transaction systems.  
Built using **Java 17, Spring Boot, Apache Kafka, and Spring Data JPA**, this project demonstrates how real-world financial institutions process and record secure, asynchronous transactions.

---

## 🚀 Features Implemented

✅ **Kafka Integration** — Real-time transaction processing via producers & consumers  
✅ **Database Layer (H2 DB)** — In-memory relational storage using Spring Data JPA  
✅ **Transaction Validation** — Ensures sender balance consistency and valid transfers  
✅ **Incentive API Integration** — Fetches external incentive amounts for transactions  
✅ **REST Balance Endpoint** — `/balance` API to query live user balances  
✅ **Unit & Integration Tests** — Covers all tasks from 1 to 5 for stability and verification

---

## 🧩 Project Architecture

midas-core-simulation/<br>
│
├── src/<br>
│ ├── main/java/com/jpmc/midascore/<br>
│ │ ├── controller/ # REST endpoints<br>
│ │ ├── listener/ # Kafka consumer logic<br>
│ │ ├── entity/ # JPA entities (UserRecord, TransactionRecord, etc.)<br>
│ │ ├── service/ # Business logic & Incentive API integration<br>
│ │ └── repository/ # JPA repositories<br>
│ └── main/resources/<br>
│ ├── application.yml # Spring configuration<br>
│ └── data.sql # Initial data load (if any)<br>
│
├── pom.xml # Maven configuration<br>
├── README.md # You are here<br>
└── .gitignore<br>


---

## ⚙️ Setup & Run Instructions

### 🧰 Prerequisites
- Java 17 or higher
- Maven 3.8+
- Kafka & Zookeeper running locally
- Incentive API service running on port 8080 (as provided in the simulation)

---

### 🏗️ Steps to Run the Project

```bash
# 1️⃣  Clone the repository
git clone https://github.com/vinay-271/midas-core-simulation.git
cd midas-core-simulation

# 2️⃣  Start Kafka & Incentive API
# (Ensure both services are running)

# 3️⃣  Build and run the Spring Boot application
mvn clean package
mvn spring-boot:run
```
## 🌐 REST API Endpoints

### 🔹 Get User Balance

**Request**

```bash
GET /balance?userId={id}
```
#### Response 200(OK)
```json
{
  "userId": 7,
  "balance": 1458.25
}
```
#### Response (when user not found)
```json
{
  "userId": 0,
  "balance": 0.0
}
```
### 🔹 Kafka Transaction Event (Example Log)
```yaml
Received transaction:
Transaction {senderId=8, recipientId=7, amount=38.74}
Processed transaction from Alice → Bob | Amount: 38.74 | Incentive: 2.15
```


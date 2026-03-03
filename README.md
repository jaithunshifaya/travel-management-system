# Travel Management System

## 📌 Overview

Travel Management System is a Java-based desktop application built using **Java Swing** and **MySQL**.
It allows users to manage travel bookings, customers, and tickets efficiently through a graphical interface.

---

## 🚀 Features

* 🔐 User Login Authentication
* 👤 Add / View Customers
* 🎫 Book and View Tickets
* 🧾 Generate Travel Details
* 🗄️ MySQL Database Integration
* 📊 JTable data display using rs2xml

---

## 🛠️ Technologies Used

* Java (JDK 8)
* Java Swing (GUI)
* MySQL Database
* JDBC
* rs2xml (for JTable integration)
* Git & GitHub

---

## 📂 Project Structure

```
Travel Management System/
│
├── src/
│   └── travel/management/system/
│
├── lib/
│   ├── mysql-connector-j-8.x.x.jar
│   └── rs2xml.jar
│
├── icons/
└── README.md
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository

```
git clone https://github.com/YOUR_USERNAME/travel-management-system.git
```

### 2️⃣ Add Required Libraries

Make sure the `lib` folder contains:

* mysql-connector-j-8.x.x.jar
* rs2xml.jar

### 3️⃣ Configure Database

Create a MySQL database and update connection details inside:

```
Conn.java
```

Example:

```java
Connection c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/travelmanagement",
    "root",
    "your_password"
);
```

### 4️⃣ Run the Project

Open `Login.java` and run the file.

---

## 🗄️ Database

Make sure MySQL is installed and running.

You must create the required tables before running the application.

---

## 📌 Future Improvements

* Convert to Spring Boot backend
* Deploy database to cloud
* Convert to web application
* Add role-based authentication

---

## 👩‍💻 Author

JAITHUN SHIFAYA

---

## 📄 License

This project is for educational purposes.

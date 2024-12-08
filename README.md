# PRESTAMOS
Prestamos e inversiones

## 1. ACTORES

### Inversionista
Quienes invierten dinero para prestar
### Cliente
A quien le hacen el préstamo
### Empresa
Donde trabaja el cliente y donde descuentan las cuotas

## 2. CASOS DE USO

### Crear Empresas
Datos de las empresas: NIT, Nombre, Dirección, Contacto, Telefono
### Actualizar Empresas
Datos de las empresas: NIT, Nombre, Dirección, Contacto, Telefono
### Listar Empresas
Listar las empresas 
### Buscar Empresas
Buscar empresas por nombre y/o Nit

### Crear Persona
Datos: Cédula, Nombre, Dirección, telefonos, email, cuenta bancaria
### Actualizar Persona
Datos: Cédula, Nombre, Dirección, telefonos
### Listar Persona
Listar inversionistas
### Buscar Persona

### Crear Inversión
Datos: Fecha, Inversionista, Capital, Interés, Plazo
### Actualizar Inversión
Datos: Fecha, Inversionista, Capital, Interés, Plazo
### Listar Inversión
### Buscar Inversión

### Crear Préstamo
Datos: Libranza #, Fecha, Cliente, Empresa, Capital, Interes, Cuota, Cuotas
### Recalculo por pago total anticipado
### Recalculo por cambio en las condiciones
Por cambios en: Capital, Interes, Cuotas
### Pagos del Préstamos
Datos: Prestamo, Valor, Fecha, Saldo, #Cuota
### Buscar Préstamos

### Listado para cobros
### Resumen de utilidades
### Liquidación de inversiones

## 3. Modelo de datos

COMPANY
|field|type|attributes
|---|---|---|
|id|varchar(36)|PK|
|nit|varchar(15)|NN|
|name|varchar(100)|NN|
|address|varchar(100)||
|contact|varchar(100)||
|phone|varchar(100)||
|email|varchar(100)||

PERSON
|field|type|attributes
|---|---|---|
|id|varchar(36)|PK|
|identification|varchar(15)|NN|
|full_name|varchar(100)|NN|
|address|varchar(100)||
|phone|varchar(100)||
|email|varchar(100)||
|bank|varchar(100)||
|bank_account|varchar(100)||

INVESTMENT
|field|type|attributes
|---|---|---|
|id|varchar(36)|PK|
|created_at|timestamp|NN|
|updated_at|timestamp|NN|
|person_id|varchar(36)|FK|
|capital|numeric(12)|FK|
|interest_rate|numeric(10,2)|NN|
|periods|integer|NN|

PAYMENT_INVESTMENT
|field|type|attributes
|---|---|---|
|id|varchar(36)|PK|
|created_at|timestamp|NN|
|updated_at|timestamp|NN|
|investment_id|varchar(36)|FK|
|amount|numeric(12)|FK|
|capital_balance|numeric(12)||
|period|integer||

LOAN
|field|type|attributes
|---|---|---|
|id|varchar(36)|PK|
|created_at|timestamp|NN|
|updated_at|timestamp|NN|
|person_id|varchar(36)|FK|
|capital|numeric(12)|NN|
|interest_rate|numeric(10,2)|NN|
|installments|numeric(10)|NN|
|installment_value|numeric(10)|NN|

LOAN_PAYMENT
|field|type|attributes
|---|---|---|
|id|varchar(36)|PK|
|created_at|timestamp|NN|
|updated_at|timestamp|NN|
|loan_id|varchar(36)|FK|
|amount|numeric(12)|FK|
|balance|numeric(12)||
|installment_number|integer||

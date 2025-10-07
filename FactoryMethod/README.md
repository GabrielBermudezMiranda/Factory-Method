# Factory Method (Java 21)

Ejemplo mínimo del patrón Factory Method en Java 21 usando Maven.

## Estructura
- `Transport` (Producto)
- `Truck` y `Ship` (Productos concretos)
- `Logistics` (Creador con Factory Method `createTransport()`)
- `RoadLogistics` y `SeaLogistics` (Creadores concretos)
- `Main` (cliente)

## Cómo compilar y ejecutar

Requisitos: JDK 21 y Maven instalados y en el PATH.

Compilar y empaquetar:

```powershell
mvn -q -DskipTests package
```

Ejecutar el JAR (modo por defecto: carretera/road):

```powershell
java -jar target/factory-method-demo-1.0.0.jar
```

Ejecutar en modo "sea":

```powershell
java -jar target/factory-method-demo-1.0.0.jar sea
```

Salida esperada:
- Road: `Truck delivered 'Books' by road`
- Sea: `Ship delivered 'Books' by sea`

También puedes ejecutar sin empaquetar:

```powershell
mvn -q -DskipTests compile exec:java -Dexec.mainClass="com.example.factory.Main" -Dexec.args="sea"
```

Si no tienes Maven, puedes compilar con `javac` directamente:

```powershell
$src = "src/main/java"; $out = "out"; mkdir $out -ErrorAction SilentlyContinue | Out-Null; `
  javac --release 21 -d $out (Get-ChildItem -Recurse $src -Filter *.java).FullName; `
  java -cp $out com.example.factory.Main sea
```

## Notas
- El proyecto usa `switch` con flechas (Java 21) para seleccionar la logística.
- El `pom.xml` configura el `Main-Class` para ejecutar el JAR directamente.

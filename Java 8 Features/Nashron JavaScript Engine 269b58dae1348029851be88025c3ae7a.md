# Nashron JavaScript Engine

## Interview-ready Answer: Nashorn in Java 8

> Nashorn is a JavaScript engine introduced in Java 8 that allows developers to run JavaScript code on the Java Virtual Machine (JVM).
> 
> 
> It replaced the older **Rhino** engine and provides much better **performance** and **ECMAScript 5.1** compliance.
> 
> It can be used to **embed JavaScript code inside Java applications** and **seamlessly interoperate between Java and JavaScript**.
> 

---

### 🔑 Key Points to Mention

- ✅ Introduced as part of **Java 8** (JSR-223 scripting support).
- ✅ Replaced the slower **Rhino** engine.
- ✅ Uses **`invokedynamic`** (JSR 292) to generate JVM bytecode dynamically → much faster.
- ✅ Allows:
    - Executing JS code from Java (`ScriptEngine`, `Invocable` APIs).
    - Calling Java classes/methods from inside JS (`Java.type()`).
- ✅ Comes with a `jjs` command-line tool to run JS files.
- ✅ Supports **ECMAScript 5.1** standard.

---

### 💻 Small Example

```java
ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
engine.eval("print('Hello from JavaScript');");

```

```java
engine.eval("function greet(n){ return 'Hello ' + n; }");
String msg = (String)((Invocable)engine).invokeFunction("greet", "Alice");
System.out.println(msg);  // Hello Alice

```

---

### ⚠️ Additional Points (Good to Impress)

- ❗ **Deprecated in Java 11** and **removed in Java 15** (reasons: maintenance burden, better alternatives like GraalVM).
- ❗ Still available as a **standalone library** if needed on newer JDKs.
- ✅ Typical use cases: embedding scripting, dynamic rule engines, templating, plugin systems.

---

### 📝 Summary Line (Good as a quick answer)

> “Nashorn is a JavaScript engine introduced in Java 8 to execute JS on the JVM, replacing Rhino, providing faster execution, ECMAScript 5.1 support, and tight Java-JS interoperability. It’s now deprecated but was a major new feature in Java 8.”
>
# Temperature Converter 使用範例

Java 溫度轉換程式（攝氏 ↔ 華氏）

## 公式
- 攝氏轉華氏：F = C × 9/5 + 32
- 華氏轉攝氏：C = (F - 32) × 5/9

## 編譯與執行

```bash
javac Temperature.java TemperatureTester.java
java TemperatureTester
```

## 程式碼範例

### 攝氏轉華氏

```java
double f = Temperature.celsiusToFahrenheit(100.0);
System.out.println(f);  // 212.0
```

### 華氏轉攝氏

```java
double c = Temperature.fahrenheitToCelsius(32.0);
System.out.println(c);  // 0.0
```

## 常見數值對照

| 說明 | 攝氏 (°C) | 華氏 (°F) |
|------|-----------|-----------|
| 水的冰點 | 0 | 32 |
| 室溫 | 25 | 77 |
| 人體體溫 | 37 | 98.6 |
| 水的沸點 | 100 | 212 |
| 兩種刻度相等 | -40 | -40 |

> 因為浮點數運算，部分結果可能會有極小的誤差（例如 `36.99999...`）。

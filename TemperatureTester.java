{\rtf1\ansi\ansicpg950\cocoartf2907
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 public class TemperatureTester \{\
    public static void main(String[] args) \{\
        // \uc0\u28204 \u35430 \u25885 \u27663 \u36681 \u33775 \u27663 \
        double c = 0.0;\
        double f = Temperature.celsiusToFahrenheit(c);\
        System.out.println(c + "\'b0C = " + f + "\'b0F");  // \uc0\u25033 \u36664 \u20986  32.0\
        \
        // \uc0\u28204 \u35430 \u33775 \u27663 \u36681 \u25885 \u27663 \
        double f2 = 98.6;\
        double c2 = Temperature.fahrenheitToCelsius(f2);\
        System.out.println(f2 + "\'b0F = " + c2 + "\'b0C");  // \uc0\u25033 \u36664 \u20986  37.0\
    \}\
\}\
}
import turtle

t = turtle.Turtle()
t.pensize(4)
t.shape("turtle")
turtle.bgcolor("LightSkyBlue")

def go(x, y):
    t.penup()
    t.goto(x, y)
    t.pendown()

def draw_flower(x, y, color, fill_color):
    t.pencolor(color)
    t.fillcolor(fill_color)
    flor(x, y)

def flor(x, y):
    go(x, y)
    t.begin_fill()
    for _ in range(5):
        t.seth(330.2 + _ * 72)
        t.circle(22.66, 236.14)
    t.end_fill()
    t.pencolor("Gold")
    t.fillcolor("Gold")
    go(x - 4.81, y + 20.88)
    t.begin_fill()
    t.seth(90)
    t.circle(22.5)
    t.end_fill()

def draw_leaf(x, y, angle, color, fill_color):
    t.pencolor(color)
    t.fillcolor(fill_color)
    hojas(x, y, angle)

def hojas(x, y, angle):
    go(x, y)
    t.begin_fill()
    t.seth(angle)
    t.circle(75.61, 121.08)
    t.seth(angle + 175.63)
    t.circle(72.70, 129.82)
    t.end_fill()

def draw_body():
    t.pencolor("DarkKhaki")
    t.fillcolor("Khaki")
    go(40.03, -167.53)
    t.begin_fill()
    t.seth(104.91)
    t.circle(120.54, 29.94)
    t.seth(49.57)
    t.circle(-315.30, 15.58)
    t.seth(33.99)
    t.circle(172.07, 64.94)
    t.seth(185.9)
    t.circle(227.51, 53.26)
    t.seth(239.17)
    t.circle(99.15, 72.41)
    t.seth(213.64)
    t.circle(74.25, 50.32)
    t.seth(336.29)
    t.circle(108.41, 47.43)
    t.end_fill()

    go(-37.02, -69.53)
    t.begin_fill()
    t.seth(98.75)
    t.circle(-121.74, 54.75)
    t.seth(131.6)
    t.circle(187.54, 48.16)
    t.seth(253.4)
    t.circle(134.51, 95.25)
    t.end_fill()

    t.pencolor("MediumVioletRed")
    t.fillcolor("HotPink")
    go(69.69, -55.52)
    t.begin_fill()
    t.seth(184.72)
    t.circle(90.59, 53.66)
    t.seth(127.63)
    t.circle(111.93, 45.5)
    t.seth(234.89)
    t.circle(80.10, 70.23)
    t.seth(9.8)
    t.circle(152.91, 31.68)
    t.seth(311.3)
    t.circle(108.05, 42.6)
    t.seth(58.45)
    t.circle(88.07, 63.09)
    t.end_fill()

    go(16.3, -99.27)
    t.begin_fill()
    t.seth(90)
    t.circle(19.5)
    t.end_fill()

def draw_leaves():
    draw_leaf(-79.30, 110.03, 165.01, "DarkGreen", "LimeGreen")
    draw_leaf(-122.12, 151, 79.67, "DarkGreen", "LimeGreen")
    draw_leaf(-100.51, 123.98, 119.46, "DarkGreen", "LawnGreen")
    draw_leaf(-90.46, 135.14, 22.07, "DarkGreen", "LawnGreen")

def draw_flowers():
    draw_flower(155.36, 115.58, "Tomato", "Orange")
    draw_flower(60.97, 170, "SteelBlue", "DarkTurquoise")
    draw_flower(-45.377, 120, "IndianRed", "LightSalmon")
    draw_flower(-11.60, 41.39, "MediumOrchid", "Violet")
    draw_flower(65.71, 85.27, "DarkGray", "White")
    
def Tulisan(msg1, msg2):
    turtle.penup()
    turtle.goto(0, -300)
    turtle.pendown()
    turtle.color('red')

    x_offset = -turtle.window_width() / 4
    for char in msg2:
        turtle.penup()  
        turtle.goto(x_offset + 73, -220)
        turtle.pendown()
        turtle.write(char, align="center", font=("Bradley Hand ITC", 30, "bold"))
        x_offset += 25
        
    x_offset = -turtle.window_width() / 4
    for char in msg1:
        turtle.penup()  
        turtle.goto(x_offset + 43, -280)
        turtle.pendown()
        turtle.write(char, align="center", font=("Bradley Hand ITC", 30, "bold"))
        x_offset += 25

def main():
    draw_body()
    draw_leaves()
    draw_flowers()
    t.hideturtle()
    Tulisan("Azhar Aulia", "I Love You")
    turtle.hideturtle()
    turtle.done()

if __name__ == "__main__":
    main()

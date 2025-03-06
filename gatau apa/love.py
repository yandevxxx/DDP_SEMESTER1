import turtle
import time

turtle.speed(5) 

turtle.color('red')

def draw_heart():
    turtle.begin_fill()
    turtle.left(140)
    turtle.forward(180)
    turtle.circle(-90, 200)
    turtle.setheading(60)
    turtle.circle(-90, 200)
    turtle.forward(180)
    turtle.end_fill()

def draw_star(x, y):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.color('saddle brown')
    turtle.begin_fill()
    for _ in range(5):
        turtle.forward(20)
        turtle.right(144)
    turtle.end_fill()

def draw_arrowLeft():
    turtle.penup()
    turtle.goto(-180, 230)
    turtle.setheading(-20)
    turtle.pendown()
    turtle.color('saddle brown')
    
    turtle.pensize(4)
    turtle.forward(35)
    draw_star(-157, 225)
    turtle.hideturtle()

def draw_arrowRight():
    turtle.penup()
    turtle.goto(120, 130)
    turtle.setheading(-20)
    turtle.pendown()
    turtle.color('saddle brown')
    
    turtle.pensize(4)
    turtle.forward(50)

    turtle.right(150)
    turtle.forward(25)
    turtle.right(120)
    turtle.forward(25)
    turtle.right(120)
    turtle.forward(25)
    draw_star(118, 138)
    turtle.hideturtle()

def Tulisan(msg1):
    turtle.penup()
    turtle.goto(0, 280)
    turtle.pendown()
    turtle.color('red')

    x_offset = -turtle.window_width() / 4
    for char in msg1:
        turtle.penup()  
        turtle.goto(x_offset + 43, 280)
        turtle.pendown()
        turtle.write(char, align="center", font=("Arial", 24, "bold"))
        x_offset += 25
        time.sleep(0.12)

def write_message(message1, message2, message3):
    turtle.penup()
    turtle.goto(0, 170)
    turtle.pendown()
    turtle.color('white')

    x_offset = -turtle.window_width() / 4
    for char in message1:
        turtle.penup()
        turtle.goto(x_offset + 77, 170)
        turtle.pendown()
        turtle.write(char, align="center", font=("Arial", 24, "bold"))
        x_offset += 25
        time.sleep(0.12)

    turtle.penup()
    turtle.goto(0, 120)
    turtle.pendown()

    x_offset = -turtle.window_width() / 4
    for char in message2:
        turtle.penup()
        turtle.goto(x_offset + 130, 120)
        turtle.pendown()
        turtle.write(char, align="center", font=("Arial", 24, "bold"))
        x_offset += 25
        time.sleep(0.12)
        
    turtle.penup()
    turtle.goto(0, 70)
    turtle.pendown()

    x_offset = -turtle.window_width() / 4
    for char in message3:
        turtle.penup()
        turtle.goto(x_offset + 177, 70)
        turtle.pendown()
        turtle.write(char, align="center", font=("Arial", 24, "bold"))
        x_offset += 25
        time.sleep(0.12)

def main():
    draw_heart()
    draw_arrowLeft()
    draw_arrowRight()
    Tulisan("Laura Anindya")
    write_message("I Love You", "Sayang", "Ku")
    turtle.hideturtle()
    turtle.done()

if __name__ == "__main__":
    main()

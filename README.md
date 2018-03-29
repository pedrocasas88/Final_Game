Synopsis

--This game draws a player spaceship who fires bullets at enemy targets. Enemies fall and spawn randomly at different speeds. as the player gets hit by enemies, the health goes down, when the player's health reaches zero the game is over.

Code Example

--

Motivation

--This game is a generic game based off of an old antique game called "Battle Star Galactica". We wanted to recreate a game from our childhood that we found entertaining. Although the game is not exact the game has basic similarity such as this game shoots spawning enemys in a space setting.

Installation

-- 1.Import file Final_Game 2.Open src folder 3.Open game package 4.Open Game.Java 5.Push Run 6.Enjoy!

API Reference

--Animaition.java java.awt.Graphics; java.awt.image.BufferedImage;

--BufferedImageLoader.java java.awt.image.BufferedImage; java.io.IOException;

--Bullet.java java.awt.Graphics; java.awt.Rectangle; java.awt.image.BufferedImage;

--Controller.java java.awt.Graphics; java.util.LinkedList; java.util.Random;

--Enemy.java java.awt.Graphics; java.awt.Rectangle; java.util.Random; classes.EntityA; classes.EntityB;

--Game.Java java.awt.Canvas; java.awt.Color; java.awt.Dimension; java.awt.Frame; java.awt.Graphics; java.awt.GridLayout; java.awt.event.ActionEvent; java.awt.event.ActionListener; java.awt.event.KeyEvent; java.awt.image.BufferStrategy; java.awt.image.BufferedImage; java.io.IOException; java.util.LinkedList; javax.swing.BorderFactory; javax.swing.JButton; javax.swing.JFrame; javax.swing.JLabel; javax.swing.JOptionPane; javax.swing.JPanel; classes.EntityA; classes.EntityB;

--GameObjective.Java java.awt.Rectangle;

--Keyput.java java.awt.event.KeyAdapter; java.awt.event.KeyEvent;

--Menu.java java.awt.Color; java.awt.Font; java.awt.Graphics; java.awt.Graphics2D; java.awt.Rectangle;

--MouseInput.java java.awt.Rectangle; java.awt.event.MouseEvent; java.awt.event.MouseListener;

--Physics.java java.util.LinkedList; classes.EntityA; classes.EntityB;

--Player.java java.awt.Graphics; java.awt.Rectangle; java.awt.image.BufferedImage; classes.EntityA; classes.EntityB;

--SpriteSheet.java java.awt.image.BufferedImage;

--Textures.java java.awt.image.BufferedImage;

Contributors

Pedro Casas pedro.casas@enmu.edu

Nathan Tarango nathan.tarango@enmu.edu

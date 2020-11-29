--GO TO localhost/phpmyadmin/ (don't forget to turn on apache and mysql in XAMPP)

--DROP DATABASE IF EXISTS afternoon_cafe;
CREATE DATABASE afternoon_cafe;

--CREATE TABLE IF NOT EXISTS
CREATE TABLE Menu(
	menuid int NOT NULL AUTO_INCREMENT,
	menuname varchar(30) NOT NULL,
	menuimg varchar(128) NOT NULL,
	menudesc varchar(256) NOT NULL,
	price decimal(15, 2) NOT NULL,
	PRIMARY KEY (menuid)
);

CREATE TABLE Music(
	musicid int NOT NULL AUTO_INCREMENT,
	musicname varchar(50) NOT NULL,
	musicartist varchar(25) NOT NULL,
	musicimg varchar(128) NOT NULL,
	PRIMARY KEY (musicid)
);

CREATE TABLE Cart(
    cartid int NOT NULL AUTO_INCREMENT,
    cartmenuname varchar(30) NOT NULL,
    cartmenuimg varchar(128) NOT NULL,
    cartmenuprice decimal(15, 2) NOT NULL,
    PRIMARY KEY (cartid)
);

--For Table Menu
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Espresso', '/images/Menu/Espresso.png', 'Espresso is a miracle in a cup of coffee! One Shot - One Pleasure', 3.15);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Cappuccino', '/images/Menu/Cappuccino.jpg', 'Coffee served with steamed milk foam that can make you fly within the foam~', 2.50);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Hot Chocolate', '/images/Menu/Hot Choco.png', 'A cup of hot chocolate with warm chocolate granules can melt your heart~', 3.20);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Green Tea Latte', '/images/Menu/Green Tea.jpg', 'Warm green tea with creamy milk that is suitable to accompany your days.', 3.20);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Tea', '/images/Menu/Tea.png', 'The warmth that can never be replaced by other warmth - I''m Tea', 2.00);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Piccolo Latte', '/images/Menu/Piccolo.jpg', 'Latte with creamer as its garnish that will decorate your heart..', 2.50);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Iced Coffee', '/images/Menu/Iced Coffee.png', 'Cold coffee that will refresh your day when the weather is boiling you up~', 3.00);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Iced Mochaccino', '/images/Menu/Iced Mochaccino.png', 'Irresistible cold coffee mixed with mild chocolate that will refresh your day.', 2.50);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Iced Vanilla Latte', '/images/Menu/Iced Vanilla Latte.png', 'Steamed milk and a shot of espresso with vanilla flavoring.', 3.20);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Iced Tea', '/images/Menu/Iced Tea.png', 'Cold tea that will refresh your world, like being refreshed by him/her♡', 2.00);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Tiramisu', '/images/Menu/Tiramisu.jpg', 'Cakes with cocoa powder that will bring you to Italy''s kind of taste!', 3.00);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Sandwich', '/images/Menu/Sandwich.png', 'Bread with all its contents that is suitable for you who like picnics.', 2.50);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Waffle', '/images/Menu/Waffle.jpg', 'A crispy and creamy waffle batter that will boost your mood..', 2.80);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Panna Cotta', '/images/Menu/Panna Cotta.jpg', 'Italian-style dessert made from cream and gelatin with many choices of flavors.', 3.25);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Crab Croissant', '/images/Menu/Crab Croissant.jpg', 'Crab-shaped Croissant that have many choices of filling(cheese, ham, etc.).', 2.75);
INSERT INTO Menu(menuname, menuimg, menudesc, price)
VALUES('Cupcake', '/images/Menu/Cupcake.png', 'Small-shaped cake that have many variety in flavors and colors.', 2.20);

--For Table Music
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Sparkle', 'RADWIMPS', '/images/music/RADWIMPS_Sparkle.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Silhouette', 'KANA-BOON', '/images/music/KANA BOON_Silhouette.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Kanashimi wo Yasashisa Ni', 'Little by Little', '/images/music/Little by Little_Kanashimi wo Yasashisa Ni.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Listen', 'Beyoncé', '/images/music/Beyonce_Listen.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Killing Me Softly', 'Fugees', '/images/music/Fugees_Killing Me Softly.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Masterpiece', 'Jessie J', '/images/music/Jessie J_Masterpiece.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Feel Special', 'TWICE', '/images/music/Twice_Feel Special.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Kill This Love', 'BLACKPINK', '/images/music/BLACKPINK_Kill This Love.jpg');
INSERT INTO Music(musicname, musicartist, musicimg)
VALUES('Boy With Luv', 'BTS (feat. Halsey)', '/images/music/BTS_Boy With Luv.jpg');
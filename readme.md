# Gemnote Backend Challenge

## Goal

Choose between Ruby on Rails and Node to create a product API from scratch.

We will be giving you a few products as examples of what we are looking for in the API, it is up to you how you want to architect and organize this. We will be providing a few screenshots to show what we want the front end to look like to give you a better idea of how we want the frontend to interact with the API. However, please don't worry about the front end for this challenge, we are just interested in seeing how you would tackle a problem like this. We want to see what your thought process is like and what your previous experiences have shaped how you work as an engineer. This should take you approximately 2-3 hours.

In order to evaluate your code, this needs to be able to run on our machines, please provide instructions to build and verify the project is working.

## Requirements
These are the minimum requirements, it is up to you if you want to add more information that you think would be useful/helpful or necessary to scale this API.

Create an API that will return to me the following products

![kinto carat coffee dripper and pot](https://s3-us-west-1.amazonaws.com/gemnote-coding-challenge/Screen+Shot+2018-01-04+at+4.19.05+PM.png)
+ Kinto Carat Coffee Dripper and Pot
    + Image
        * https://gemnote-images-production.s3-us-west-2.amazonaws.com/items/default_images/000/000/610/full_size/kinto_carat_coffee_dripper_and_pot.jpg?1510489804
    + Information
        * 4.4" x 8" x 5.5"
        * Superior stainless-steel and heat-resistant glass glass
        * Set comes with a stainless-steel filter that allows for greater extraction of coffee oils than a paper filter, resulting in a richer and smoother coffee
        * Pot, dripper, lid: microwave and dishwasher safe
        * Filter, holder, silicone ring: dishwasher safe
        * 24.3oz
    + Pricing
        * $64.00 / unit

![patagonia hybrid jacket](https://s3-us-west-1.amazonaws.com/gemnote-coding-challenge/Screen+Shot+2018-01-04+at+10.39.27+AM.png)
+ Patagonia Hybrid Jacket
    + Images
        * black patagonia jacket - https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/000/899/full_size/patagonia_women_s_adze_hybrid_jacket___black.jpg?1510663389
        * white patagonia jacket - https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/000/899/full_size/patagonia_women_s_adze_hybrid_jacket___black.jpg?1510663389
    + Information
        * 93% polyester/7% spandex stretch woven with fleece grid backer
        * 3-layer Polartec Windbloc stretch-woven polyester soft-shell with a DWR (durable water repellent) finish
        * Stretchy, breathable, double-weave soft-shell fabric on side panels, underarms and cuffs
        * High, harness- and pack-compatible handwarmer pockets and one interior chest pocket have brushed tricot lining
    + Pricing
        * $189/unit

![Dick Taylor Bars](https://s3-us-west-1.amazonaws.com/gemnote-coding-challenge/Screen+Shot+2018-01-04+at+4.52.07+PM.png)
+ Dick Taylor Bars
    * Images
        - Brown butter with nibs + sea salt - https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/717/full_size/dick_taylor_bars_with_inclusions___brown_butter_with_nibs___sea_salt.jpg?1510664223
        - Fleur De Sel - https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/716/full_size/dick_taylor_bars_with_inclusions___fleur_de_sel.jpg?1510664222
        - Black Fig - https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/715/full_size/dick_taylor_bars_with_inclusions___black_fig.jpg?1510664221
        - Maple Coconut - https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/714/full_size/dick_taylor_bars_with_inclusions___maple_coconut.jpg?1510664221
    * Information
        - Using the finest cacao, and a modern take on traditional European technique, we are able to fully realize the potential of the beans we source.
        - All of our chocolate is carefully crafted from the bean in our small factory in Northern California.
        - 2 oz
    * Pricing
        - $8.50/unit



## Build and Run

This project is built with Java SDK 1.8 using the Spring Boot Framework and Maven build automation tool. We are using an embedded (in-memory) database.

1. Clone the Project

2. Import Project into IDEA/ECLIPSE as a Maven project

3. Build and package

```
$ mvn clean package

```

4. Run app
```
$ mvn spring-boot:run

```

5. Create (POST) products via command line

Kinto Carat Coffee Dripper and Pot
```
$ curl -i -X POST -H "Content-Type:application/json" -d '{ "productName" : "Kinto Carat Coffee Dripper and Pot", "imageUris" : {"" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/items/default_images/000/000/610/full_size/kinto_carat_coffee_dripper_and_pot.jpg?1510489804"}, "informationDetails": ["4.4\" x 8\" x 5.5\"", "Superior stainless-steel and heat-resistant glass glass", "Set comes with a stainless-steel filter that allows for greater extraction of coffee oils than a paper filter, resulting in a richer and smoother coffee", "Pot, dripper, lid: microwave and dishwasher safe", "Filter, holder, silicone ring: dishwasher safe", "24.3oz"], "pricePerUnit" : 64.0, "brandName" : "Kinto", "productCategory" : "DRINKWARE"}' localhost:8080/products

```
Patagonia Hybrid Jacket
```
$ curl -i -X POST -H "Content-Type:application/json" -d '{ "productName" : "Patagonia Hybrid Jacket", "imageUris" : {"black patagonia jacket" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/000/899/full_size/patagonia_women_s_adze_hybrid_jacket___black.jpg?1510663389", "white patagonia jacket" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/000/899/full_size/patagonia_women_s_adze_hybrid_jacket___black.jpg?1510663389"}, "informationDetails": ["93% polyester/7% spandex stretch woven with fleece grid backer", "3-layer Polartec Windbloc stretch-woven polyester soft-shell with a DWR (durable water repellent) finish", "Stretchy, breathable, double-weave soft-shell fabric on side panels, underarms and cuffs", "High, harness- and pack-compatible handwarmer pockets and one interior chest pocket have brushed tricot lining"], "pricePerUnit" : 189.0, "brandName" : "Patagonia", "productCategory" : "APPAREL_WOMENS", "colors" : ["Black", "Gray"]}' localhost:8080/products

```
Dick Taylor Bars
```
$ curl -i -X POST -H "Content-Type:application/json" -d '{ "productName" : "Dick Taylor Bars with Inclusions", "imageUris" : {"Brown butter with nibs + sea salt" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/717/full_size/dick_taylor_bars_with_inclusions___brown_butter_with_nibs___sea_salt.jpg?1510664223", "Fleur De Sel" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/716/full_size/dick_taylor_bars_with_inclusions___fleur_de_sel.jpg?1510664222", "Black Fig" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/715/full_size/dick_taylor_bars_with_inclusions___black_fig.jpg?1510664221", "Maple Coconut" : "https://gemnote-images-production.s3-us-west-2.amazonaws.com/images/images/000/001/714/full_size/dick_taylor_bars_with_inclusions___maple_coconut.jpg?1510664221"}, "informationDetails": ["Using the finest cacao, and a modern take on traditional European technique, we are able to fully realize the potential of the beans we source.", "All of our chocolate is carefully crafted from the bean in our small factory in Northern California.", "2 oz"], "pricePerUnit" : 8.50, "brandName" : "Dick Taylor", "productCategory" : "FOOD_BEVERAGE", "flavors" : ["Mapple Coconut", "Brown butter with nibs + sea salt", "Fleur De Sel", "Black Fig"]}' localhost:8080/products

```

6. Retrieve (GET) all products via command line
```
curl localhost:8080/products
```


# Initialized Repo
The first step I took was to initialize a new repo on GitHub called Personal-Portfolio with a README, a .gitignore, and a LICENCE. I then cloned the repository to my local documents and opened it in VS Code.

# Initialize Spring Project
Following the Spring Boot guide: Serving Web Content with Spring Boot, I initialized a new spring project with the thymeleaf dependancy and downloaded it to my computer. I then extracted the files into the Personal-Portfolio project folder that I cloned into my local documents.

# Create the AboutController
Continuing in the tutorial, I created the GreetingController.java file in a new folder named Controllers, in the PersonalPortfolio Project Folder. I then changed the @GetMapping to map to GET requests to "/about". Additionally, I adjusted the code from the tutorial to return "about".

# Create the HTML files.
After the controller was created, I created both the index.html and greeting.html pages that were given in the tutorial. For the greeting.html page, I changed the name to about.html. With some of the slight modifications to the file naming, I tested my web page just as the tutorial described and had no issues.

# Designing the page
Inspired by the Washington Vets to Tech Bios, I decided to try and replicate their designs on my webpage. First I conceptually broke the page into a header, main, and footer. Then within the main section, I broke into three sections that would be classed as "sidebar" "bio" and "skills. This would conceptually layout the page similar to the bio slide. Using a CSS grid, I set main to "display: grid" and created a template for a 2 x 3 grid layout. The "sidebar" would occupy the entire 1st column, the "bio would occupy row 2 of column 2, and the "skills" would occupy row 3 of column 2. Finally, I created a flexbox for the skills section that would dynamically adjust size based on the viewport.

# Challenges
The main challenge I faced during this project was aligning the grid and flexbox as well as sizing them correctly. Originally I calculated all of the column and row dimensions manually based on the viewport until I discovered the min-content size which would allow the grid to adopt the size of the sections which I could then set min and max widths. This allowed to web page to be more dynamic and support mobile browsers.
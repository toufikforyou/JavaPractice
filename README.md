# Getting Started with Java in VS Code

Welcome to your Java project! This guide will help you get set up and start coding with Java in Visual Studio Code.

## Project Structure

This project follows a standard Java project structure to help keep your code organized. Here's a breakdown of the key folders:

- **`src`:** This is where you'll write your Java source code files (`.java`).
- **`lib`:** Place any external library dependencies (JAR files) that your project relies on within this folder.
- **`bin`:** This folder is automatically generated and managed by VS Code. It contains the compiled Java class files (`.class`) generated from your source code. You typically won't interact with this folder directly.

> **Customizing the Project Structure:** If you need to customize the location of these folders (e.g., change the output directory), you can do so by modifying the `settings.json` file located in the `.vscode` directory. This file allows for fine-grained control over your project's configuration.

## Dependency Management

Managing dependencies is crucial for most Java projects. Visual Studio Code provides a convenient way to handle these through the **JAVA PROJECTS** view.

**How to Manage Dependencies:**

1.  **Access the JAVA PROJECTS View:** Look for the **JAVA PROJECTS** icon in the VS Code Activity Bar (usually on the left side).
2.  **Add Dependencies:** In the **JAVA PROJECTS** view, you'll see a section for "Referenced Libraries." You can add dependencies by:
    - **Adding JARs manually:** Right-click on "Referenced Libraries" and select "Add JARs..." to include local JAR files from your `lib` folder or elsewhere on your system.
    - **Using a build tool (Recommended):** If you're using a build tool like Maven or Gradle, dependencies are managed through `pom.xml` (Maven) or `build.gradle` (Gradle) files. VS Code will automatically recognize and use these files.
3.  **Explore Dependencies:** You can expand the "Referenced Libraries" section to see the list of dependencies and their versions.

**Learn More:**

- For a more detailed guide on dependency management in VS Code, see the official documentation: [VS Code Java Dependency Management](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
- Consider using build tools like Maven or Gradle. They are strongly encouraged for larger projects to manage dependencies and the build process automatically.

## Running Your Code

1. Open your java file from `src` folder.
2. Click the `Run` button above `main` function.

## Next Steps

- **Write Some Code:** Start by creating a new `.java` file in the `src` folder and begin writing your Java code.
- **Explore the VS Code Java Extension:** The VS Code Java extension offers features like code completion, debugging, and refactoring that can significantly boost your productivity.
- **Learn More About Java:** If you're new to Java, consider checking out online tutorials and courses to learn the fundamentals.

We hope you enjoy developing with Java in VS Code!

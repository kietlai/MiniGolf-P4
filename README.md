# Mini-Golf
By: Sai and Kiet

  src/
  ├── game/
  │   ├── core/
  │   │   ├── Game.java              //main game controller
  │   │   ├── GameState.java         //game state management
  │   │   ├── Level.java             //individual level representation
  │   │   └── MiniGolf.java          //main entry point
  │   │
  │   ├── entities/
  │   │   ├── Ball.java              //golf ball physics & state
  │   │   ├── Hole.java              //target hole
  │   │   └── Tee.java               //starting position
  │   │
  │   ├── obstacles/
  │   │   ├── Obstacle.java          //base obstacle interface
  │   │   ├── StaticWall.java        //basic walls
  │   │   ├── SandTrap.java          //friction obstacles
  │   │   ├── WaterHazard.java       //reset obstacles
  │   │   ├── Windmill.java          //moving obstacles
  │   │   ├── Ramp.java              //elevation changes
  │   │   └── Bumper.java            //bouncy obstacles
  │   │
  │   ├── physics/
  │   │   ├── PhysicsEngine.java     //main physics calculations
  │   │   ├── Collision.java         //collision detection
  │   │   ├── Vector2D.java          // 2D vector math
  │   │   └── Friction.java          // Surface friction handling
  │   │
  │   ├── input/
  │   │   ├── InputManager.java      // Centralized input handling
  │   │   ├── MouseHandler.java      // Mouse aiming logic
  │   │   └── KeyboardHandler.java   // Keyboard controls
  │   │
  │   ├── rendering/
  │   │   ├── Renderer.java          // Main rendering controller
  │   │   ├── Camera.java            // Viewport management
  │   │   ├── TerrainRenderer.java   // Elevation visualization
  │   │   └── UIRenderer.java        // HUD and menus
  │   │
  │   ├── levels/
  │   │   ├── LevelGenerator.java    // Procedural level creation
  │   │   ├── LevelLoader.java       // Load predefined levels
  │   │   ├── TerrainMap.java        // Elevation data
  │   │   └── LevelValidator.java    // Ensure level completability
  │   │
  │   ├── geometry/
  │   │   ├── Point.java             // 2D point (existing)
  │   │   ├── Polygon.java           // Polygon shapes (existing)
  │   │   ├── Circle.java            // Circular shapes
  │   │   └── Rectangle.java         // Rectangular bounds
  │   │
  │   └── utils/
  │       ├── MathUtils.java         // Mathematical utilities
  │       ├── FileUtils.java         // File I/O operations
  │       └── Constants.java         // Game constants
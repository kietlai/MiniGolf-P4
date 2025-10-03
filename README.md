# Mini-Golf
By: Sai and Kiet

## Project Structure

```
src/
├── game/
│   ├── core/
│   │   ├── Game.java              // Main game controller
│   │   ├── GameState.java         // Game state management
│   │   ├── Level.java             // Individual level representation
│   │   └── MiniGolf.java          // Main entry point
│   │
│   ├── entities/
│   │   ├── Ball.java              // Golf ball physics & state
│   │   ├── Hole.java              // Target hole
│   │   └── Tee.java               // Starting position
│   │
│   ├── obstacles/
│   │   ├── Obstacle.java          // Base obstacle interface
│   │   ├── StaticWall.java        // Basic walls
│   │   ├── SandTrap.java          // Friction obstacles
│   │   ├── WaterHazard.java       // Reset obstacles
│   │   ├── Windmill.java          // Moving obstacles
│   │   ├── Ramp.java              // Elevation changes
│   │   └── Bumper.java            // Bouncy obstacles
│   │
│   ├── physics/
│   │   ├── PhysicsEngine.java     // Main physics calculations
│   │   ├── Collision.java         // Collision detection
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
```
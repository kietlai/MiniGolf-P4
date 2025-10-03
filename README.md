# Mini-Golf
By: Sai and Kiet

## Project Structure

```
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
│   │   └── Hole.java              //target hole
│   │
│   ├── obstacles/
│   │   ├── Obstacle.java          //base obstacle Abstract Class
│   │   ├── Walls.java             //walls interface
│   │   ├── EdgeWall.java          //map borders
│   │   ├── StaticWall.java        //basic walls
│   │   ├── SandTrap.java          //friction obstacles
│   │   ├── WaterHazard.java       //reset obstacles
│   │   ├── Windmill.java          //moving obstacles
│   │   ├── Ramp.java              //velocity modifier zones
│   │   └── Bumper.java            //bouncy obstacles
│   │
│   ├── physics/
│   │   ├── PhysicsEngine.java     //main physics calculations
│   │   ├── Collision.java         //collision detection
│   │   ├── Vector2D.java          //2D vector math
│   │   └── Friction.java          //surface friction handling
│   │
│   ├── input/
│   │   ├── InputManager.java      //centralized input handling
│   │   ├── MouseHandler.java      //mouse aiming logic
│   │   └── KeyboardHandler.java   //keyboard controls
│   │
│   ├── rendering/
│   │   ├── Renderer.java          //main rendering controller
│   │   ├── Camera.java            //viewport management
│   │   └── UIRenderer.java        //HUD and menus
│   │
│   ├── levels/
│   │   ├── LevelGenerator.java    //procedural level creation
│   │   ├── LevelLoader.java       //load predefined levels
│   │   └── LevelValidator.java    //ensure level completability
│   │
│   ├── geometry/
│   │   ├── Point.java             //2D point (existing)
│   │   ├── Polygon.java           //polygon shapes (existing)
│   │   ├── Circle.java            //circular shapes
│   │   └── Rectangle.java         //rectangular bounds
│   │
│   └── utils/
│       ├── MathUtils.java         //mathematical utilities
│       ├── FileUtils.java         //file I/O operations
│       └── Constants.java         //game constants
```

## Project 4 Requirements Mapping

**3+ Different Elements (Classes):**
- `Ball.java` - Golf ball entity
- `Hole.java` - Target hole entity  
- `StaticWall.java` - Wall obstacles
- `SandTrap.java` - Friction obstacles
- `WaterHazard.java` - Reset obstacles
- `Windmill.java` - Moving obstacles
- `Ramp.java` - Velocity modifier zones
- `Bumper.java` - Bouncy obstacles

**Interface:**
- `Obstacle.java` - Interface implemented by all obstacle types

**2 Inner Classes:**
- `Level.ObstaclePlacer` - Handles obstacle placement within levels
- `PhysicsEngine.CollisionResponse` - Processes collision responses

**Anonymous Class:**
- `InputManager.setupKeyListener()` - KeyListener for input handling

**Lambda Expression:**
- Will be used in level generation for obstacle filtering/processing

**Additional Features:**
- **Keyboard Input:** Spacebar for shooting, scroll wheel for power adjustment
- **Collision Detection:** Ball vs obstacles, walls, and hole
- **Element Rotation:** Windmill obstacles and ball aiming direction
- **Movement:** Ball physics with velocity and friction

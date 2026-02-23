# Travel Weather Planner

An advanced interactive decision engine for optimal commute planning based on environmental conditions and available transportation resources. Built with cutting-edge web technologies to demonstrate sophisticated conditional logic implementation across multiple programming languages.

## Overview

The Travel Weather Planner solves a classic programming logic challenge: determining whether commuting is possible given specific constraints including distance, weather conditions, and available transportation modes. This implementation transforms a simple algorithmic problem into an immersive, interactive web experience.

## Core Logic

The decision engine evaluates commute feasibility through a hierarchical conditional structure:

```
IF distance is falsy (0/null/undefined):
    → Commute impossible
    
ELIF distance ≤ 1 mile:
    → Walking viable (if not raining)
    
ELIF distance ≤ 6 miles:
    → Cycling viable (if bike available AND not raining)
    
ELSE (distance > 6 miles):
    → Driving required (car OR ride-share app)
```

## Features

### Interactive Control Panel
- **Distance Slider**: Real-time adjustable range (0-20 miles) with 0.1-mile precision
- **Toggle Switches**: Four environmental/resource variables with distinct visual states
  - Precipitation status (rain/no rain)
  - Bicycle availability
  - Vehicle access
  - Ride-share application access
- **Quick Scenario Presets**: One-click loading of common commute situations

### Visual Decision Tree
Live visualization of the logic flow showing:
- Current evaluation node highlighting
- Active condition pathways
- Real-time result status with color-coded states
- Transport mode availability indicators

### Multi-Language Code Reference
Tabbed interface displaying synchronized implementations in:
- **Python**: Clean, readable syntax with boolean operators
- **JavaScript**: ES6+ implementation with strict equality checks
- **Java**: Type-safe implementation with explicit boolean logic

All code panels update dynamically to reflect current input states.

### Dynamic Visual Feedback
- Particle effects on user interactions
- Animated state transitions
- Glowing result indicators (success/failure states)
- Real-time transport mode highlighting
- Glitch text effects on headers

## Technical Implementation

### Frontend Stack
- **HTML5**: Semantic structure with accessibility considerations
- **CSS3**: Advanced features including:
  - CSS Grid and Flexbox layouts
  - Custom properties (CSS variables)
  - Backdrop filters (glassmorphism)
  - Keyframe animations
  - Custom range inputs and toggle switches
- **Vanilla JavaScript**: Zero-dependency implementation featuring:
  - State management pattern
  - DOM manipulation and event delegation
  - Dynamic code generation
  - Particle system physics

### Design System
- **Typography**: Space Grotesk (display) + Inter (body)
- **Color Palette**:
  - Neon Cyan (`#00f3ff`): Primary actions, distances
  - Neon Purple (`#bc13fe`): Ride-share indicators
  - Neon Green (`#0aff0a`): Success states, bike indicators
  - Gold (`#ffd700`): Vehicle indicators
  - Dark backgrounds with gradient mesh overlays

### Responsive Behavior
- Mobile-first responsive design
- Breakpoint optimization at 768px (md) and 1024px (lg)
- Touch-friendly control surfaces
- Adaptive typography scaling

## Algorithm Details

The planner implements a strict evaluation order:

1. **Falsy Check**: Validates distance input exists and is non-zero
2. **Walking Range** (0-1 mi): Requires clear weather only
3. **Cycling Range** (1-6 mi): Requires both bicycle possession AND clear weather
4. **Driving Range** (6+ mi): Requires either personal vehicle OR ride-share access

Boolean operators used:
- `AND` (`&&`/`and`): Both conditions must satisfy (bike + no rain)
- `OR` (`||`/`or`): Either condition satisfies (car or ride)
- `NOT` (`!`/`not`): Condition negation (not raining)

## Usage

1. Adjust the distance slider to set travel distance
2. Toggle environmental conditions and available resources
3. Observe real-time result calculation
4. Reference the decision tree for logic flow visualization
5. Study code implementations across languages in the tabbed interface

## Browser Compatibility

- Chrome 90+
- Firefox 88+
- Safari 14+
- Edge 90+

Requires support for:
- CSS Backdrop Filter
- CSS Grid
- ES6+ JavaScript
- CSS Custom Properties

## Performance

- 60fps animations using CSS transforms
- Optimized DOM updates (minimal reflows)
- Passive event listeners for scroll/touch
- Hardware-accelerated particle effects

## License

Open source implementation for educational and portfolio purposes.

---

Built with precision. No external dependencies. Pure web standards.

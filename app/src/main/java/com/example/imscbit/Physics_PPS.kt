package com.example.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
val modulespps1= arrayOf("Introduction to Programming: Introduction to components of a computer system (disks, memory, processor, where a program is stored and executed, operating system, compilers etc.) Problem Solving: Steps to solve logical and numerical problems. Representation of Algorithm: Flowchart/Pseudo code with examples. From algorithms to programs; source code, variables (with data types) variables and memory locations, Syntax and Logical Errors in compilation, object and executable code.",
    "Arithmetic expressions and precedence, Conditional Branching and Loops, Writing and evaluation of conditionals, Iterations, Loops.",
    "Array, Character array, strings. Case studies to discuss the various Problems related to Basic science (Matrix addition, Matrix-matrix multiplication, Roots of an equation etc.), Sorting, Searching.",
    "Functions (including using built in libraries), Parameter passing in functions, call by value, call by reference. Passing arrays to functions, Recursion (Finding Factorial, Fibonacci series, Ackerman function etc.).",
    "Structures, Defining structures and Array of Structures Pointers: Defining pointers, Use of Pointers in self-referential structures, File Handling")
val refbookspps1= arrayOf(
    "1. Hanly Jery R, Problem solving and Program design in C, 7th Edition Pearson Education.\n" +
            "2. Gottfried Byron, Schaum's Outline of Programming with C, McGraw-Hill.\n" +
            "3. Balaguruswamy E., Programming in ANSI C, Tata McGraw-Hill.\n" +
            "4. Dromey R.G., How to Solve it by Computer, Pearson Education.",
    "1. Kernighan Brian W. and Ritchie Dennis M., The C Programming Language, Prentice.")
val modulespps2= arrayOf("Introduction: Importance of Electrical Engineering in day-to-day life, Electrical elements,\n" +
        "properties and their classification, Ideal and Real Sources, Source Conversion\n" +
        "D.C. Circuits: KCL and KVL, Loop current and Nodal voltage method Steady state analysis with\n" +
        "independent and dependent sources; Star-Delta conversion.\n" +
        "Magnetic Circuits: Introduction, Series-parallel magnetic circuits, Analysis of Linear and Nonlinear magnetic circuits, Energy storage, A.C. excitation, Eddy currents and Hysteresis losses.",
    "Single-phase AC Circuits: Series Circuits: Common signals and their waveforms, RMS and\n" +
            "Average value, Form factor & Peak factor of sinusoidal waveform, Impedance of Series circuits.\n" +
            "Phasor diagram, Active Power, Power factor. Power triangle.\n" +
            "Parallel Circuits: Admittance method, Phasor diagram. Power, Power factor. Power triangle,\n" +
            "Series- parallel Circuit, Power factor improvement,\n" +
            "Series and Parallel Resonance: Resonance curve, Q–factor, Dynamic Impedance and Bandwidth.",
    "Three-Phase Circuits: Line and Phase relation for Star and Delta connection, Power relations,\n" +
            "Analysis of balanced and unbalanced 3 phase circuits, Measurement of Power",
    "Circuit Theorems: Superposition theorem, Thevenin’s & Norton’s Theorem, Maximum Power\n" +
            "Transfer theorem for Independent and Dependent Sources for DC and AC circuits.\n" +
            "Coupled Circuits (Dot rule), Self and mutual inductances, Coefficient of coupling. ",
    "Working principles of AC Generators, motors and transformers, working principles of measuring\n" +
            "equipments such as digital voltmeter, ammeter, power factor meter and wattmeter")
val refbookspps2= arrayOf(
    "1. Hughes Electrical Technology, Pearson, 10th edition, 2011.\n" +
            "2. Fitzgerald and Higginbotham, Basic Electrical Engineering, McGraw Hill Inc, 1981.\n" +
            "3. D.P. Kothari and I.J. Nagrath, Basic Electrical Engineering, 3rd Edition, TMH, 2009. ",
    "a. W. H. Hayt, Jr J. E. Kemmerly and S. M. Durbin, Engineering Circuit Analysis, 7th Edn TMH,\n" +
            "2010.\n" +
            "b. Electrical Engineering Fundamental, Vincent Del Toro, Prentice Hall, New Delhi. ")
val modulespps3= arrayOf("Diodes and Applications: Introduction to PN junction diodes; Characteristics of semiconductor\n" +
        "diodes: V-I characteristics, diode-resistance, temperature-dependence, diode-capacitance; DC &\n" +
        "AC load lines; Breakdown Mechanisms; Zener Diode – Operation and Applications; Diode as a\n" +
        "Rectifier: Half Wave and Full Wave Rectifiers with and without C-Filters. ",
    "Bipolar Junction Transistors (BJT): PNP and NPN Transistors, Basic Transistor Action, Input\n" +
            "and Output Characteristics of CB, CE and CC Configurations, dc and ac load line analysis,\n" +
            "operating point, Transistor biasing: Fixed bias, emitter bias/self-bias, Low-frequency response of\n" +
            "CE amplifier.\n" +
            "Field Effect Transistors: JFET, Idea of Channel Formation, Pinch-Off and saturation Voltage,\n" +
            "Current-Voltage Output Characteristics; MOSFET: Basic structure, operation and characteristics.",
    "Sinusoidal Oscillators: Concept of positive and negative feedback, Barkhausen criterion for\n" +
            "sustained oscillations, Determination of Frequency and Condition of oscillation, Hartley and\n" +
            "Colpitt’s oscillator\n" +
            "Operational Amplifiers: Characteristics of an Ideal and Practical Operational Amplifier (IC 741),\n" +
            "Inverting and non-inverting amplifiers, Offset error voltages and currents; Power supply rejection\n" +
            "ratio, Slew Rate and concept of Virtual Ground, Summing and Difference Amplifiers,\n" +
            "Differentiator and Integrator, RC phase shift oscillator. ",
    "Logic Gates and Boolean algebra: Introduction to Boolean Algebra and Boolean operators,\n" +
            "Symbolic representation, Boolean algebraic function and Truth table of different Digital logic\n" +
            "Gates (AND, OR, NOT, NAND, NOR, EX-OR, EX-NOR); Realization of Basic logic gates using\n" +
            "universal gates, Adder, Subtractor, adder/subtractor. ",
    "Electronic communication: Introduction to electronic communication system, Electromagnetic\n" +
            "Communication spectrum band and applications, Elements of Electronic Communication System;\n" +
            "Merits and demerits of analog and digital communication, Modes of communication; Signal\n" +
            "radiation and propagation; Need for modulation; Introduction to Amplitude modulation and Angle\n" +
            "modulation. ")
val refbookspps3= arrayOf(
    "1. Millman J., Halkias C.C., Parikh Chetan, “Integrated Electronics: Analog and Digital\n" +
            "Circuits and Systems”, Tata McGraw-Hill, 2/e.\n" +
            "2. Mano M.M., “Digital Logic and Computer Design”, Pearson Education, Inc, Thirteenth\n" +
            "Impression, 2011.\n" +
            "3. Singal T. L., “Analog and Digital Communications”, Tata McGraw-Hill, 2/e.\n" +
            "4. Haykin S., Moher M., “Introduction to Analog & Digital Communications”, Wiley India\n" +
            "Pvt. Ltd., 2/e. ",
    "1. Boylstead R.L., Nashelsky L., “Electronic Devices and Circuit Theory”, Pearson\n" +
            "Education, Inc, 10/e. ")
val modulespps4= arrayOf("Renewable and Non-renewable Energy Resources, Advantages and Disadvantages of Renewable\n" +
        "Resources, Renewable Energy Forms and Conversion, Solar Energy, Wind Energy, Tidal Energy, Ocean\n" +
        "Thermal Energy; Geothermal Energy, Nuclear Energy, Hydro Energy",
    "Addition of Forces, Moment of a Force, Couple, Varignon’s theorem, Free Body Diagram, Equilibrium in\n" +
            "Two and Three Dimensions, Equivalent Forces and Moment. Types of Trusses, Plane and Space Trusses.\n" +
            "Analysis of Plane Trusses by: Method of Joints and Method of Sections, Analysis of Frames with Hinged\n" +
            "Joints. Hooke’s Law of elasticity, Stress and Strain, Relation between elastic constants, Thermal Stresses,\n" +
            "Properties of surfaces such as centroid and area moment of inertia.",
    "Types of rigid body motion– translation, rotation about fixed axis, equations defining the rotation of a rigid\n" +
            "body about a fixed axis, plane motion, absolute and relative velocity in plane motion, instantaneous center\n" +
            "of rotation. Equation of translational and rotational motion, Newton’s law and D’Alembert’s principle –\n" +
            "inertia force and inertia couple. ",
    "Introduction to robotics, Law of robotics, Classification of robots based on: DOF, Structure, Drive\n" +
            "technology and workspace geometry, robot subsystem, criteria for selecting a robot, applications of\n" +
            "robotics. ",
    "Boiler Mountings and Accessories, Fire Tube and Water Tube Boilers, Cochran Boiler, Lancashire Boiler,\n" +
            "Locomotive Boiler, Babcock and Wilcox Boiler; Boiler Mountings & accessories, Basic components and\n" +
            "terminology of IC engines, working of four stroke/two stroke - petrol/diesel engine, classification and\n" +
            "application of IC engines.")
val refbookspps4= arrayOf(
    "xt Books\n" +
            "1. Engineering. Mechanics by Irving H. Shames, P H I. ltd.\n" +
            "2. Non-Conventional Energy Resources by G.D. Rai, Khanna Publishers. \n" +
            "3. Textbook of Elements of Mechanical Engineering – S. Trymbaka Murthy\n" +
            "4. Internal Combustion Engines – V Ganesan\n" +
            "5. Introduction to Robotics, Subir Kumar Saha, TMH, New Delhi, 2014 ",
    "1. Strength of Materials by F.L. Singer, Longman\n" +
            "2. Basic Mechanical Engineering by Pravin Kumar, Pearson.\n" +
            "3. Principles of Mechanical Engineering by R P Sharma, Global Academic Publishers. \n")

class Physics_PPS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics__p_p_s)
        val button1 = findViewById<Button>(R.id.pps_sub1)
        val button2 = findViewById<Button>(R.id.pps_sub2)
        val button3 = findViewById<Button>(R.id.pps_sub3)
        val button4 = findViewById<Button>(R.id.pps_sub4)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespps1)
            intent.putExtra("books", refbookspps1)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespps2)
            intent.putExtra("books", refbookspps2)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespps3)
            intent.putExtra("books", refbookspps3)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespps4)
            intent.putExtra("books", refbookspps4)
            startActivity(intent)
        }
    }
}
package com.example.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
val modulespe41= arrayOf("General features of Earth’s atmosphere: Thermal structure of the Earth’s Atmosphere, Ionosphere,\n" +
        "Composition of atmosphere, Hydrostatic equation, Potential temperature, Atmospheric Thermodynamics,\n" +
        "Greenhouse effect and effective temperature of Earth, Local winds, monsoons, fogs, clouds, precipitation,\n" +
        "Atmospheric boundary layer, Sea breeze and land breeze. Instruments for meteorological observations",
    "Atmospheric Dynamics: Scale analysis, Fundamental forces, Basic conservation laws, The Vectorial form\n" +
            "of the momentum equation in rotating coordinate system, scale analysis of equation of motion, Applications\n" +
            "of the basic equations, Circulations and vorticity",
    "Atmospheric radiation and remote sensing\n" +
            "Fundamental laws of radiation: Planks law, Stefan’s Boltzmann law, Wien’s displacement law, Kirchhoff’s\n" +
            "law; Spectral distribution of solar radiation and atmosphere interaction, path radiance, turbulance, cloud\n" +
            "effect; Outgoing long-wave radiation, Radiation budget, Atmospheric windows, Emissivity, Absorption\n" +
            "spectra of atmospheric gases, optical depth, atmospheric correction techniques for remote sensing data, SST\n" +
            "extraction",
    "Atmospheric Radar and Lidar: Radar equation and return signal, Signal processing and detection,\n" +
            "Various type of atmospheric radars, Application of radars to study atmospheric phenomena, Lidar and its\n" +
            "applications, Application of Lidar to study atmospheric phenomenon. Data analysis tools and techniques",
    "Atmospheric Aerosols: Classification and properties of aerosols, Production and removal mechanisms,\n" +
            "Concentrations and size distribution, Absorption and scattering of solar radiation, Rayleigh scattering and\n" +
            "Mie scattering, Lambert’s and Beer’s laws, Radiative and health effects, Air pollution/pollutants, Effect of\n" +
            "boundary layer dynamics on air pollutants")
val refbookspe41= arrayOf(
    "T1: Atmospheric Science : An Introductory Survey ,Second Edition -John M.Wallace and Peter V. Hobbs,\n" +
            "University of Washington",
    "R2: Atmospheric chemistry and physics: from air pollution to climate change, Second edition- John H. Seinfeld,\n" +
            "Spyros N. Pandis, a wiley-interscience publication, john wiley & sons, inc.\n" +
            "R3: An Introduction to dynamic meteorology – James R Holton; Academic Press, 2004 R4: Radar for meteorological and atmospheric observations – S. Fukao and K. Hamazu, Springer Japan, 2014\n" +
            "R5: Fundamentals of Remote Sensing, George Joseph and Jeganathan, c. (2017). 3rd Edition, Universities Press,\n" +
            "ISBN 978 93 86235 46 6")
val modulespe42= arrayOf("X-ray Diffraction Methods:\n" +
        "Classification of crystal system, Bragg’s law and Laue conditions, Powder methods, crystal size analysis,\n" +
        "Rietvold method of structural analysis, X-ray fluorescence spectroscopy, applications of emission spectra\n" +
        "for compounds and alloys, Applications of absorption spectra for solid solutions and transitional metal\n" +
        "compounds, Neutron spectroscopy. X-Ray Reflectivity",
    "Microscopy & Spectroscopy\n" +
            "Optical microscopy, metallurgical microscope, TEM, SEM and AFM, Atomic absorption\n" +
            "spectrophotometer and its application to environmental analysis, UV-visible spectroscopy and its\n" +
            "application, IR-spectroscopy and its application, AES, XPS, Introduction to RBS, SIMS, and its\n" +
            "applications. Basic principles of ESR, Instrumentations and applications, Principle of Mossbauer\n" +
            "spectroscopy, Isomer shift, Quadruple splitting and hyperfine interaction, applications-in determination\n" +
            "of phases and diffusion studies.",
    "Thermochemical analysis\n" +
            "Thermo analytical techniques, Instrumentation and applications of TGA, DTA, DSC",
    "Electrochemical Techniques\n" +
            "Electrochemical Instrumentation, Coulometry, polarography, cyclic voltametry, application to oxidationreduction\n" +
            "reaction, Principle of Corrosion, types and prevention",
    "Vacuum Technology & Thin film Deposition Technique\n" +
            "Application to Vacuum Technology, Types of vacuum pumps, different technique of thin film deposition\n" +
            "CVD, PVD, MBE, MOCVD")
val refbookspe42= arrayOf(
    "1. Solid State Physics- Structure and Properties of Materials M. A. Wahab, Narosa 2015.\n" +
            "2. Spectroscopy, Vol. I, II and III, ed. By Straughan and Walker, John Wiley.\n" +
            "3. Surface Analysis – The Principal Techniques, Edited by J. C. Vickerman, John Willey & Sons\n" +
            "4. Instrumental Methods of Chemical Analysis By G. W. Ewing, Mcgraw –Hill Book Company\n" +
            "5. Vacuum Science and Technology by V.V. Rao, T.B. Gosh, K.L. Chopra, Allied Publishers, 17-Oct-1998",
    "")
class Physics_PE_IV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics__p_e__i_v)
        val button1 = findViewById<Button>(R.id.pe4_sub1)
        val button2 = findViewById<Button>(R.id.pe4_sub2)

        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe41)
            intent.putExtra("books", refbookspe41)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe42)
            intent.putExtra("books", refbookspe42)
            startActivity(intent)
        }
    }
}
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>KR9 Informática</title>

    <style>
        body {
            margin: 0;
            padding: 0;
            background-image: url('https://i.imgur.com/laX2E5U.png');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            height: 100vh;
        }

        .carousel {
            width: 100%;
            margin: 0 auto;
            max-width: 1500px; /* Ajuste a largura máxima do carrossel conforme necessário */
        }

        .carousel img {
            width: 100%;
            height: auto;
        }

        /* Adicionado para ajustar a posição dos botões */
        .fixed-buttons {
            position: fixed;
            top: 20px;
            left: 20px;
            z-index: 1;
        }

        /* Adicionado para remover a borda verde-água */
        .fixed-buttons .btn-img {
            background-color: transparent;
            border: none;
            padding: 0;
        }

        /* Alterado a cor de fundo para azul */
        nav .nav-wrapper {
            background-color: #000000	; /* Azul (#0000FF) */
        }
    </style>

    <link href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body class="background-image">

    <!-- Botões das Redes Sociais -->
    <div class="fixed-buttons">
    <button type="button" class="btn btn-img"
        onclick="window.open('https://www.facebook.com/profile.php?id=61553682487326', '_blank')">
        <img src="https://i.imgur.com/eciK6eU.png" alt="Facebook" width="30" height="30">
    </button>
    <button type="button" class="btn btn-img" 
        onclick="window.open('https://wa.me/5519981987162', '_blank')">
        <img src="https://i.imgur.com/mV2UGjK.png" alt="WhatsApp" width="30" height="30">
    </button>
    <button type="button" class="btn btn-img" 
        onclick="window.open('https://www.instagram.com/kr9oficial/', '_blank')">
        <img src="https://i.imgur.com/OWdUupI.png" alt="Instagram" width="30" height="30">
    </button>
</div>
    <!-- Fim dos Botões das Redes Sociais -->

    <nav>
        <div class="nav-wrapper">
    <a href="#" class="brand-logo right">
        <img src="https://i.imgur.com/qVKB42l.png" alt="Logo" style="height: 70px; width: auto;">
    </a>
    <ul id="nav-mobile" class="left hide-on-med-and-down">
        
    </ul>
</div>
    </nav>

    <div class="collapse" id="navbarToggleExternalContent">
        <div class="bg-dark p-4">
            <h5 class="text-white h4"></h5>
            <span class="text-muted"></span>
        </div>
    </div>

<div class="carousel">
  <div><img src="https://i.imgur.com/CfGD5WJ.jpg" ></div>
  <div><img src="https://i.imgur.com/fA2EFFT.jpg" ></div>
  <div><img src="https://i.imgur.com/m9G2H5Z.jpg" ></div>
  <div><img src="https://i.imgur.com/dFmmRSf.jpg" ></div>
  <div><img src="https://i.imgur.com/xyoXbLH.jpg" ></div>
  <div><img src="https://i.imgur.com/yiwCCeJ.jpg"></div>
  <div><img src="https://i.imgur.com/C6ihiuN.jpg" ></div>
  <div><img src="https://i.imgur.com/ZtXOoE8.jpg" ></div>
</div> 
        
        
        <!-- Fim do Carrossel Bootstrap -->
  
  
  <h1> </h1>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script>
    $('.carousel').slick({
    	  dots: true,
    	  infinite: true,
    	  slidesToShow: 4,
    	  slidesToScroll: 4,
          autoplay: true,  // Adicionado para tornar o carrossel automático
          autoplaySpeed: 2000
    
    	});

        document.addEventListener('DOMContentLoaded', function () {
            var collapsibleElems = document.querySelectorAll('.collapsible');
            var collapsibleInstances = M.Collapsible.init(collapsibleElems);
        });
    </script>

</body>

</html>

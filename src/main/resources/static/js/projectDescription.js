document.addEventListener("DOMContentLoaded", function () {
  document.querySelectorAll(".toggle-btn").forEach((button) => {
    button.addEventListener("click", function () {
      this.classList.toggle("active");
      let content = this.nextElementSibling;
      if (content.style.display === "block") {
        content.style.display = "none";
      } else {
        content.style.display = "block";
      }
    });
  });
});

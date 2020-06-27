
// Pie Chart Example
var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
  type: 'doughnut',
  data: {
    labels: ["Sala", "Cozinha", "Banheiro", 'Quarto'],
    datasets: [{
      data: [45, 30, 15, 10],
      backgroundColor: ['#27a745', '#17A2B8', '#ffc107', '#6C757D'],
      hoverBackgroundColor: ['#27a745', '#17A2B8', '#ffc107', '#6C757D']
    }],
  },
  options: {
    maintainAspectRatio: false,
    tooltips: {
      backgroundColor: "rgb(255,255,255)",
      bodyFontColor: "#858796",
      borderColor: '#dddfeb',
      borderWidth: 1,
      xPadding: 15,
      yPadding: 15,
      displayColors: false,
      caretPadding: 10,
    },
    legend: {
      display: false
    },
    cutoutPercentage: 80,
  },
});

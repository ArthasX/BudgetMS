/**
 * 项目表头
 * 
 */
var proInfoAdjColum = [ {
	header : '项目信息调整编号',
	dataIndex : 'proInfoAdjId',
	width : 150
}, {
	header : '项目信息编号',
	dataIndex : 'proInfoId',
	width : 150
}, {
	header : '调整类型',
	dataIndex : 'adjType'
}, {
	header : '调整金额',
	dataIndex : 'AdjAmt'

}, {
	header : '操作日期',
	dataIndex : 'optDate'
}, {
	header : '备注',
	dataIndex : 'remark',

} ];

Ext.define('BudgetMS.view.pro.proInfoAdj.list', {
	extend : 'BudgetMS.view.ux.baseGrid',
	alias : 'widget.proInfoAdjList',
	id : 'proInfoAdjList',
	name : 'proInfoAdj',// Ext.widget(name+'Edit') name+'Add'
	store : 'proInfoAdjStore',
	border : false,
	// frame : true,// 渲染
	enableKeyNav : true,// 键盘控制
	columnLines : true,// 竖线
	tbar : {
		items : [ {
			xtype : 'proTbarForm'
		} ]
	},
	dockedItems : [ {
		xtype : 'pagingtoolbar',
		store : 'proStore',
		dock : 'bottom',
		displayInfo : true
	} ],
	initComponent : function() {
		this.columns = proInfoAdjColum;
		this.callParent(arguments);
		console.log(this.name);
		// Ext.apply(this.down('pagingToolbar').store,Ext.create('BudgetMS.store.proStore'));
	}

});

/**
 * 分页工具栏
 */

// var pagingToolbar = Ext.create('Ext.PagingToolbar', {
// store : 'proStore',
// displayInfo : true,
// displayMsg : 'Displaying topics {0} - {1} of {2}',
// emptyMsg : "No topics to display",
// items : [ '-', {
// text : 'Show Preview',
// pressed : true,
// enableToggle : true,
// toggleHandler : function(btn, pressed) {
// //var preview = Ext.getCmp('gv').getPlugin('preview');
// //preview.toggleExpanded(pressed);
// }
// } ]
// });
// /**
// * 提取了一个停靠组件的类，方便维护
// */
// Ext.define('oaSystem.view.main.region.GridToolbar', {
// extend : 'Ext.toolbar.Toolbar',
// alias : 'widget.gridtoolbar',
// initComponent : function() {
// this.items = [{
// text : '新增',
// glyph : 0xf016,
// },{
// text : '修改',
// glyph : 0xf044
// },{
// text : '删除',
// glyph : 0xf014
// },{
// text : '查看',
// glyph : 0xf022
// }];
// this.callParent();
// }
// });
//
